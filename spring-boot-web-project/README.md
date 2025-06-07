# Spring Boot Web Project

This is a simple Spring Boot web application that provides user login functionality. The application uses an H2 in-memory database to store user credentials.

## Project Structure

```
spring-boot-web-project
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           ├── SpringBootWebProjectApplication.java
│   │   │           ├── controller
│   │   │           │   └── LoginController.java
│   │   │           ├── service
│   │   │           │   └── LoginService.java
│   │   │           └── model
│   │   │               └── User.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── data.sql
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── SpringBootWebProjectApplicationTests.java
├── pom.xml
└── README.md
```

## Setup Instructions

1. **Clone the repository**:
   ```
   git clone <repository-url>
   cd spring-boot-web-project
   ```

2. **Build the project**:
   Use Maven to build the project:
   ```
   mvn clean install
   ```

3. **Run the application**:
   You can run the application using the following command:
   ```
   mvn spring-boot:run
   ```

4. **Access the application**:
   Open your web browser and navigate to `http://localhost:8080/login` to access the login page.

## Usage

- The application supports two default users:
  - Username: `user1`, Password: `password`
  - Username: `user2`, Password: `password`

- You can log in using either of the above credentials.

## Testing

The project includes test cases for the `LoginService` and `LoginController`. You can run the tests using:
```
mvn test
```

## Dependencies

This project uses the following dependencies:
- Spring Boot Starter Web
- Spring Boot Starter Test
- H2 Database

## License

This project is licensed under the MIT License.