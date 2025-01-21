package com.example.Forum.model;
//Esta entidad representa un usuario del foro, con atributos como email, contraseña y tópicos creados.
import jakarta.persistence.*;
import java.util.Set;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // Identificador único del usuario
    private String email;  // Email del usuario
    private String password;  // Contraseña del usuario

    @OneToMany(mappedBy = "usuario")
    private Set<Topico> topicos;  // Tópicos creados por el usuario

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Topico> getTopicos() {
        return topicos;
    }

    public void setTopicos(Set<Topico> topicos) {
        this.topicos = topicos;
    }
}
