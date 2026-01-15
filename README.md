# Automation Test Execution Framework 🚀

## 📌 Overview
The **Automation Test Execution Framework** is a Spring Boot–based backend application designed to manage, execute, and monitor automated test jobs in a structured and scalable way.

This project was developed as part of the **Infosys Springboard Internship Program** to demonstrate real-world backend development concepts such as REST APIs, layered architecture, database integration, and clean code practices.

The framework acts as a central engine where automation test executions can be triggered, tracked, and extended in the future with advanced orchestration features.

---

## 🎯 Objectives of the Project
- Build a clean and modular **test execution backend**
- Expose REST APIs to verify application health and execution readiness
- Use **Spring Boot best practices**
- Demonstrate database connectivity using **Spring Data JPA**
- Maintain a **professional GitHub repository** with documentation and license

---

## 🛠️ Tech Stack Used
- **Java 17**
- **Spring Boot 3.5.9**
- **Spring Web (REST APIs)**
- **Spring Data JPA**
- **H2 In-Memory Database**
- **Maven**
- **Apache Tomcat (Embedded)**
- **Git & GitHub**

---

## 📂 Project Structure
# Automation Test Execution Framework 🚀

## 📌 Overview
The **Automation Test Execution Framework** is a Spring Boot–based backend application designed to manage, execute, and monitor automated test jobs in a structured and scalable way.

This project was developed as part of the **Infosys Springboard Internship Program** to demonstrate real-world backend development concepts such as REST APIs, layered architecture, database integration, and clean code practices.

The framework acts as a central engine where automation test executions can be triggered, tracked, and extended in the future with advanced orchestration features.

---

## 🎯 Objectives of the Project
- Build a clean and modular **test execution backend**
- Expose REST APIs to verify application health and execution readiness
- Use **Spring Boot best practices**
- Demonstrate database connectivity using **Spring Data JPA**
- Maintain a **professional GitHub repository** with documentation and license

---

## 🛠️ Tech Stack Used
- **Java 17**
- **Spring Boot 3.5.9**
- **Spring Web (REST APIs)**
- **Spring Data JPA**
- **H2 In-Memory Database**
- **Maven**
- **Apache Tomcat (Embedded)**
- **Git & GitHub**

---

## 📂 Project Structure
automation-test-framework
│
├── src
│ ├── main
│ │ ├── java
│ │ │ └── com.infosys.internship.automationtestframework
│ │ │ ├── AutomationTestFrameworkApplication.java
│ │ │ └── HealthController.java
│ │ └── resources
│ │ └── application.properties
│ │
│ └── test
│ └── java
│ └── AutomationTestFrameworkApplicationTests.java
│
├── .mvn
├── mvnw
├── mvnw.cmd
├── pom.xml
├── LICENSE
├── README.md
└── HELP.md


---

## 🔍 Key Features Implemented

### ✅ Health Check API
A REST endpoint to verify that the application is running successfully.

**Endpoint**

GET /health

**Response**
Automation Test Framework is running successfully 🚀


This confirms:
- Application startup is successful
- Embedded Tomcat is running
- REST layer is working correctly

---

## ▶️ How to Run the Project Locally

### Prerequisites
- Java 17 installed
- Internet connection (for Maven dependencies)
- VS Code / IntelliJ (optional but recommended)

### Steps
```bash
cd automation-test-framework
cd automation-test-framework
.\mvnw.cmd spring-boot:run

Access in Browser
http://localhost:8080/health


---

🧪 Database Configuration

Uses H2 In-Memory Database

Automatically configured by Spring Boot

No external database setup required

Ideal for testing and development

---

📜 License

This project is licensed under the MIT License.
You are free to use, modify, and distribute this project with proper attribution.

---

📅 Agile Execution Notes

Project setup using Spring Initializr

REST API implementation

Database configuration and validation

Local testing and debugging

GitHub version control with clean commits

Documentation and license addition


---

🙌Acknowledgement

This project was developed during the Infosys Springboard Internship under the guidance of mentors and instructors.
Reference projects were studied for understanding, but the implementation and structure were built independently.

---

## 🎓 Internship Context

This project was developed as part of the **Infosys Springboard Internship Program**.

It demonstrates:
- Spring Boot backend development
- REST API design
- Maven project structure
- H2 database integration
- Clean code and documentation practices

This repository fulfills the internship requirement of:
- Clean functional codebase
- Proper documentation
- MIT License inclusion
