# Java Servlet Projects

This repository contains Java Servlet projects that demonstrate the basics of Java Servlets and how to create web applications using Servlets. 

1. Hello Servlet: This project returns a message "Hello Servlet, this is my first servlet project!!!" when accessed through a browser.

2. Personalized Greeting: This project allows the user to input their name and displays a personalized greeting message "Hello, [name]".

3. Password Validation: In this project, the user's password is validated. If the password is "servlet", the request is forwarded to the `InputNameServlet`, otherwise an error message "sorry username or password error!" is displayed.

## Getting Started

These instructions will help you to run the projects locally on your machine.

### Prerequisites

Before you begin, make sure you have the following tools installed:

- Eclipse IDE with Apache Tomcat server plugin
- Java JDK

### Installation

1. Clone or download the repository to your local machine.
2. Open Eclipse and import the projects as "Existing Projects into Workspace".
3. Right-click on each project in the Package Explorer and select "Run As" > "Run on Server".

### Usage

1. Hello Servlet: The project will be accessible in your web browser at `http://localhost:8080/PracticeServlet-Project/Hello`.

2. Personalized Greeting: The form for entering name can be accessed in your web browser at `http://localhost:8080/PracticeServlet-Project/index.html`. After submitting the name, it will redirect to the second servlet and the message "Hello, [name]" can be accessed at `http://localhost:8080/PracticeServlet-Project/InputNameServlet?name=[name]`.

3. Password Validation: The password validation form can be accessed in your web browser at `http://localhost:8080/ServletProject/login.html`. If the password is correct, it will redirect to the `InputNameServlet` and display the message "Hello, [name]" at `http://localhost:8080/PracticeServlet-Project/InputNameServlet?name=[name]`. If the password is incorrect, an error message "sorry username or password error!" will be displayed with the userName and password entry form to re-enter.

## Built With

- Java Servlets
- Eclipse IDE
