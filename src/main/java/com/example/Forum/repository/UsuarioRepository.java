package com.example.Forum.repository;
//Esta interfaz maneja las operaciones CRUD para la entidad Usuario.
import com.example.Forum.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByEmail(String email);  // Buscar usuario por email
}



