package com.example.Forum.model;
//Esta entidad representa un tópico en el foro, con atributos como título, mensaje, fecha de creación y usuario asociado.
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // Identificador único del tópico
    private String titulo;  // Título del tópico
    private String mensaje;  // Mensaje del tópico
    private LocalDateTime fechaCreacion = LocalDateTime.now();  // Fecha de creación del tópico

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;  // Usuario que creó el tópico

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
