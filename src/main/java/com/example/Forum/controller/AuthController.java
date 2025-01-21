package com.example.Forum.controller;

import com.example.Forum.security.JwtUtil;
import com.example.Forum.model.Usuario;
import com.example.Forum.model.AuthResponse;
import com.example.Forum.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<?> authenticate(@RequestBody Usuario loginRequest) {
        try {
            // Autenticar el usuario
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(loginRequest.getEmail(), loginRequest.getPassword())
            );

            // Generar token JWT
            final String token = jwtUtil.generateToken(loginRequest.getEmail());

            // Retornar respuesta con el token
            return ResponseEntity.ok(new AuthResponse("Usuario registrado exitosamente", token));
        } catch (AuthenticationException e) {
            // Manejar errores de autenticación
            return ResponseEntity.status(401).body(new AuthResponse("Credenciales incorrectas", null));
        }
    }
}

