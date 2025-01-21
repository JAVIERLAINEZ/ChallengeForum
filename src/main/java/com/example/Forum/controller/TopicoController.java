package com.example.Forum.controller;

import com.example.Forum.model.Topico;
import com.example.Forum.service.TopicoService;
import com.example.Forum.security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/topicos")
public class TopicoController {
    @Autowired
    private TopicoService topicoService;

    @Autowired
    private JwtUtil jwtUtil;

    @GetMapping
    public ResponseEntity<List<Topico>> listarTopicos() {
        List<Topico> topicos = topicoService.findAll();
        return ResponseEntity.ok(topicos);
    }

    @PostMapping
    public ResponseEntity<?> crearTopico(@RequestBody Topico topico, @RequestHeader("Authorization") String token) {
        if (!jwtUtil.validateJwtToken(token)) {
            return ResponseEntity.status(403).body("Usuario No registrado");
        }

        // Obtener el email del token JWT
        String email = jwtUtil.getEmailFromJwtToken(token);

        // Asociar el tópico con el usuario autenticado
        topicoService.crearTopico(topico, email);

        return ResponseEntity.status(201).body("Tópico creado exitosamente");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarTopico(@PathVariable Long id, @RequestHeader("Authorization") String token) {
        if (!jwtUtil.validateJwtToken(token)) {
            return ResponseEntity.status(403).body("Usuario No registrado");
        }

        Optional<Topico> topicoOpt = topicoService.findById(id);
        if (!topicoOpt.isPresent()) {
            return ResponseEntity.status(404).body("Tópico no fue encontrado");
        }

        topicoService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
