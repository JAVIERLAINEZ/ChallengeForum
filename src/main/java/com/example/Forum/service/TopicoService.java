package com.example.Forum.service;

import com.example.Forum.model.Topico;
import com.example.Forum.model.Usuario;
import com.example.Forum.repository.TopicoRepository;
import com.example.Forum.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TopicoService {

    @Autowired
    private TopicoRepository topicoRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Topico crearTopico(Topico topico, String email) {
        Usuario usuario = usuarioRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado con el email: " + email));
        topico.setUsuario(usuario);
        return topicoRepository.save(topico);
    }

    public List<Topico> findAll() {
        return topicoRepository.findAll();
    }

    public Optional<Topico> findById(Long id) {
        return topicoRepository.findById(id);
    }

    public void deleteById(Long id) {
        topicoRepository.deleteById(id);
    }
}
