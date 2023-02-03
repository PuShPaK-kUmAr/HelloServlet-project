# Servlet Project

This is a simple Servlet project that demonstrates the basics of Java Servlets and how to create a web application using Servlets. The project returns a message "Hello Servlet, this is my first servlet project!!!" when accessed through a browser and also allows the user to input their name and displays a personalized greeting message "Hello, [name]".

## Getting Started

These instructions will help you to run the project locally on your machine.

### Prerequisites

Before you begin, make sure you have the following tools installed:

- Eclipse IDE with Apache Tomcat server plugin
- Java JDK

### Installation

1. Clone or download the project to your local machine.
2. Open Eclipse and import the project as a "Existing Projects into Workspace".
3. Right-click on the project in the Package Explorer and select "Run As" > "Run on Server".

### Usage

The project will be accessible in your web browser at `http://localhost:8080/ServletProject/Hello` for the first servlet, and 
The form for entering name can be accessed in your web browser at `http://localhost:8080/PracticeServlet-Project/index.html` 
After submitting the name, it will redirect to the second servlet and the message "Hello, [name]" can be accessed at http://localhost:8080/PracticeServlet/InputNameServlet?name=[name].


## Built With

- Java Servlets
- Eclipse IDE
