package com.example.Forum.model;
//Esta clase maneja las respuestas de autenticación con un mensaje y un token.
public class AuthResponse {
    private String message;  // Mensaje de respuesta
    private String token;  // Token de autenticación

    // Constructor
    public AuthResponse(String message, String token) {
        this.message = message;
        this.token = token;
    }

    // Getters y setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
