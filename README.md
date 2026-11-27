# AlbaLab API

API REST desarrollada con Spring Boot para gestionar contactos y mensajes de atención/postulación (`contactos`), conectada a MySQL y con migraciones gestionadas mediante Flyway, diseñada como backend para la aplicación Android (`AppCORPALIV_grupo11`).

## Tecnologías utilizadas

* **Lenguaje y Framework:** Java (Spring Boot)
* **Persistencia:** Spring Data JPA / Hibernate
* **Base de datos:** MySQL (`albalab_db`)
* **Migraciones:** Flyway (`V1.0.1__init.sql`)
* **Utilidades:** Lombok, Spring Web, Validation
* **Build:** Maven (`./mvnw`)

## Estructura del proyecto

```text
src/main/java/duoc/cl/albaLab/
├── controller/
│   └── ContactoController.java     # Endpoints REST (/api/contactos)
├── model/
│   └── Contacto.java               # Entidad JPA mapeada a la tabla contactos
├── repository/
│   └── ContactoRepository.java     # Acceso a datos con JpaRepository
├── service/
│   └── ContactoService.java        # Lógica de negocio CRUD
└── AlbaLabApplication.java         # Clase principal de arranque

src/main/resources/
├── db/migration/
│   └── V1.0.1__init.sql            # Creación de tabla y datos iniciales
└── application.properties          # Configuración de servidor, datasource y Flyway
