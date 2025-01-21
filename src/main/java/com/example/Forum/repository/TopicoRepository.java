package com.example.Forum.repository;
//Esta interfaz maneja las operaciones CRUD para la entidad Topico
import com.example.Forum.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
    // Repositorio para la entidad Topico
}


