# 📚 Backend - Sombras y Letras (Biblioteca Digital)

Este proyecto es el backend de la biblioteca digital **Sombras y Letras**, desarrollado con **Spring Boot** y conectado a una base de datos MySQL. Expone una API REST que permite gestionar libros, autores, categorías, usuarios y préstamos.

## ⚙️ Tecnologías utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Lombok
- Spring Web

---

## 📂 Estructura del proyecto

Backend-Library/
├── src/
│ ├── main/
│ │ ├── java/com/example/biblioteca/
│ │ └── resources/
│ │ ├── application.properties
├── database/
│ └── dblibrarybp.sql
├── pom.xml
└── README.md


---

## 🚀 ¿Qué incluye?

- API REST para libros, autores, categorías, usuarios y préstamos.
- Configuración para CORS (permite conexión con frontend en React).
- Base de datos exportada (`dblibrarybp.sql`) para restaurar en MySQL.

---

## 🧩 Pasos para ejecutar el backend

### 1. Clonar el repositorio

```bash
git clone https://github.com/Darianyv/Backend-Library.git
cd Backend-Library

2. Importar la base de datos en MySQL
Requisitos previos:
Tener instalado MySQL (puede ser desde XAMPP, WAMP o servidor standalone).

Pasos:
Abrir phpMyAdmin o tu cliente de base de datos.

Crear una nueva base de datos con el nombre dblibrarybp.

Importar el archivo dblibrarybp.sql ubicado en la carpeta Base de datos/

En phpMyAdmin:

Ir a la base de datos creada.

Hacer clic en Importar.

Seleccionar el archivo dblibrarybp.sql.

Clic en Continuar.

3. Configurar application.properties
Ubicado en: src/main/resources/application.properties

Asegúrate de que esté así (ajusta según tus credenciales):

properties
Copiar
Editar
spring.datasource.url=jdbc:mysql://localhost:3306/dblibrarybp
spring.datasource.username=root
spring.datasource.password=

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

server.port=8080
Si usas una contraseña en tu MySQL, colócala en spring.datasource.password.

4. Ejecutar el backend
Puedes hacerlo desde tu IDE (IntelliJ, Eclipse o Spring Tools Suite) ejecutando la clase principal:

java
Copiar
Editar
BibliotecaApplication.java
O desde consola:

bash
Copiar
Editar
./mvnw spring-boot:run
El backend estará disponible en: http://localhost:8080

🌐 Endpoints disponibles (ejemplos)
GET /libros - Listar libros

POST /libros - Agregar libro

GET /usuarios - Listar usuarios

POST /prestamos - Crear préstamo

PUT /libros/{id} - Actualizar libro

DELETE /usuarios/{id} - Eliminar usuario

Puedes probar los endpoints desde Postman o conectando el frontend.
