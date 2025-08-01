# 🧑‍💻 CRUD de Personas - Spring Boot

Este es un proyecto básico de CRUD (Create, Read, Update, Delete) desarrollado con **Spring Boot**. El objetivo es practicar la creación de endpoints RESTful y probarlos con **Postman**, sin necesidad de una base de datos.

---

## ⚙️ Tecnologías usadas

- Java 17
- Spring Boot
- Maven
- Postman
- Git & GitHub

---

## 🚀 Endpoints implementados

| Método | Endpoint              | Descripción                  |
|--------|-----------------------|------------------------------|
| GET    | `/personas`           | Lista general de personas    |
| GET    | `/personas/femenino`  | Lista de personas femeninas  |
| GET    | `/personas/masculino` | Lista de personas masculinas |
| POST   | `/personas/crear`     | Crear nueva persona          |
| PUT    | `/personas/modificar` | Modificar persona existente  |
| DELETE | `/personas/eliminar/{id}` | Eliminar por ID         |

---

```markdown
![Postman GET personas](src/img/get-personas.png)
![Postman POST crear persona](src/img/post-crear.png)

Sobre mí
Hola, soy Christian Huarcaya, estudiante de Ingeniería de Sistemas e Informática.

git clone https://github.com/ChristianHuarcaya/Mini-crud-de-personas-usando-spring-boot-y-postman-sin-base-de-datos.git
Ábrelo en tu IDE (Eclipse, IntelliJ, VS Code)

Ejecuta la clase SimulacionApplication.java

Prueba los endpoints desde Postman en la URL:
http://localhost:8087/simulacion