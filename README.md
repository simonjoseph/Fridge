# Fridge

Fridge is a Spring Boot application for managing food items in a fridge. It uses an in-memory H2 database, JPA for persistence, and Flyway for database migrations.

## Features

- Add, list, update, and delete food items
- REST API for data manipulation
- H2 console enabled for database inspection

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- H2 Database
- Flyway

## How to Run

1. Clone the repository:
   ```bash
   git clone <repository-url>
   ```
2. Start the application:
   ```bash
   ./mvnw spring-boot:run
   ```
3. Access the H2 console at: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

## Project Structure

- `controller/` - REST controllers
- `model/` - JPA entities
- `service/` - Business logic
- `Repository/` - JPA repositories

## Configuration

Database settings are in `src/main/resources/application.yml`.

---
