# Foro de Discusión

<img src="https://github.com/user-attachments/assets/fab0841b-6b3b-4eec-952a-88354aa22e97" alt="una imagen sencilla que describa un foro" width="400" height="400">

## Insignias
[![Build Status](https://img.shields.io/badge/build-passing-brightgreen)](https://shields.io)
[![Java](https://img.shields.io/badge/Java-17-blue)](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.1-brightgreen)](https://spring.io/projects/spring-boot)

## Índice
1. [Descripción del Proyecto](#descripción-del-proyecto)
2. [Estado del Proyecto](#estado-del-proyecto)
3. [Demostración de Funciones y Aplicaciones](#demostración-de-funciones-y-aplicaciones)
4. [Acceso al Proyecto](#acceso-al-proyecto)
5. [Nivel de Seguridad](#nivel-de-seguridad)
6. [Tecnologías Utilizadas](#tecnologías-utilizadas)
7. [Personas Contribuyentes](#personas-contribuyentes)
8. [Personas Desarrolladoras del Proyecto](#personas-desarrolladoras-del-proyecto)
9. [Licencia](#licencia)

## Descripción del Proyecto
El proyecto **Foro de Discusión** es una plataforma web diseñada para permitir a los usuarios crear, listar y discutir sobre diversos temas. Los usuarios pueden autenticarse, crear tópicos, y participar en discusiones.  

## Estado del Proyecto
El proyecto se encuentra en desarrollo activo. Actualmente, las funcionalidades de autenticación y gestión de tópicos están implementadas y en fase de mejora continua.

## Demostración de Funciones y Aplicaciones
### Autenticación de Usuarios
Los usuarios pueden autenticarse utilizando su email y contraseña para obtener un token JWT. Todas las funcionalidades serán únicamente accesibles por usuarios correctamente registrados en la base de datos PostgreSQL.

### Creación de Tópicos
Los usuarios autenticados pueden crear nuevos tópicos proporcionando un título, mensaje y el nombre del curso.

### Listado de Tópicos
Los usuarios pueden listar todos los tópicos disponibles en la plataforma.

### Eliminación de Tópicos
Los usuarios autenticados pueden eliminar tópicos existentes.

## Acceso al Proyecto
Puedes acceder al proyecto en el siguiente [enlace de GitHub](https://github.com/JAVIERLAINEZ/ChallengeForum.git).

## Nivel de Seguridad
La seguridad es una prioridad en el proyecto **Foro de Discusión**, y se han implementado varias medidas para proteger los datos de los usuarios y garantizar una experiencia segura y confiable.

### 1. Autenticación Basada en JWT
El sistema de autenticación utiliza JSON Web Tokens (JWT) para gestionar las sesiones de los usuarios. Un token JWT se genera al iniciar sesión y se incluye en cada solicitud subsecuente en la cabecera `Authorization`. Este token es validado en cada solicitud para asegurar que el usuario esté autenticado.

### 2. Encriptación de Contraseñas con BCrypt
Las contraseñas de los usuarios se encriptan utilizando el algoritmo BCrypt antes de almacenarse en la base de datos. BCrypt aplica una función de hash resistente a ataques de fuerza bruta, lo que garantiza que incluso si la base de datos se ve comprometida, las contraseñas permanezcan seguras.

### 3. Protección Contra CSRF
Se ha deshabilitado la protección contra ataques CSRF en la configuración de seguridad para simplificar el desarrollo y las pruebas. No obstante, en un entorno de producción, se recomienda habilitar esta protección para mitigar ataques de falsificación de peticiones en sitios cruzados.

### 4. Validación de Tokens JWT
Los tokens JWT son validados en cada solicitud utilizando la clase `JwtUtil`. Esta clase asegura que el token sea válido y no haya sido manipulado. Además, se verifica la expiración del token para garantizar que solo los tokens válidos puedan acceder a los recursos protegidos.

### 5. Gestión de Sesiones Stateless
La aplicación está configurada para utilizar sesiones stateless, lo que significa que no se almacena información de la sesión en el servidor. En su lugar, toda la información de autenticación se incluye en el token JWT, lo que mejora la escalabilidad y reduce la carga en el servidor.

Estas medidas de seguridad se combinan para proporcionar un entorno seguro y protegido para los usuarios del foro.

## Tecnologías Utilizadas
- **Java 17**: Lenguaje de programación.
- **Spring Boot 3.4.1**: Framework para la creación de aplicaciones Java.
- **PostgreSQL**: Sistema de gestión de bases de datos.
- **JWT (Json Web Token)**: Autenticación basada en tokens.
- **BCrypt**: Encriptación de contraseñas.

## Personas Contribuyentes
- Javier Lainez
- Oracle a través de su programa ONE, en colaboración con Alura Latam.  

## Personas Desarrolladoras del Proyecto
- Javier Lainez

## Licencia
Este proyecto está bajo licencia libre.
