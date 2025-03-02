# YOLOps

**YOLOps** is a **DevOps Dashboard** designed to provide insights into running services, open pull requests, quick deployments, and security monitoring.

## **Project Structure**
The project follows a **multi-module Gradle setup** with the following structure:

```
YOLOps/
├── backend/            # Backend services (Spring Boot)
│   ├── application/    # Main backend application
│   ├── core/           # Core domain logic
│   ├── ports/          # Interfaces for external interactions
│   ├── adapters/       # Infrastructure & external service adapters
├── frontend/           # Frontend application (React, Vite)
├── Writerside/         # Writerside documentation
├── build.gradle.kts    # Root Gradle build script
├── settings.gradle.kts # Gradle module definitions
└── README.md           # Project documentation
```

## **Tech Stack**
- **Backend**: Spring Boot (WebFlux, R2DBC), PostgreSQL
- **Frontend**: React, TypeScript, Vite
- **Documentation**: JetBrains Writerside
- **Build System**: Gradle (Kotlin DSL)
- **Testing**:
    - **Backend**: JUnit 5, Reactor Test
    - **Frontend**: Playwright

## **Getting Started**

### **Prerequisites**
- **Java 21** (Ensure Java 21 is installed)
- **Gradle** (Recommended to use the Gradle Wrapper)
- **PostgreSQL** (For production backend, but an H2 in-memory DB is used for development)

### **Building the Project**
```sh
./gradlew build
```

### **Running the Backend**
By default, the backend runs with an in-memory H2 database for development:
```sh
./gradlew :backend:application:bootRun
```
To run with **PostgreSQL**, set the `SPRING_PROFILES_ACTIVE` environment variable:
```sh
SPRING_PROFILES_ACTIVE=prod ./gradlew :backend:application:bootRun
```

### **Running the Frontend**
The frontend build process is fully automated using Gradle. This includes downloading and installing Node.js, npm, and Yarn, as well as running the development server:
```sh
./gradlew :frontend:dev
```
This command ensures that all dependencies are installed and starts the development server.

To build the frontend for production:
```sh
./gradlew :frontend:build
```

## **Testing**
Run backend tests:
```sh
./gradlew test
```
Run frontend tests:
```sh
./gradlew :frontend:test
```

## **Documentation**
The project documentation is maintained in JetBrains Writerside and located in the Writerside/ directory. Currently, the Writerside folder is not part of the Gradle project and needs to be managed separately.

To view the documentation, open the Writerside project in IntelliJ IDEA with the Writerside plugin installed.

For more details, refer to the Writerside documentation in the repository.

