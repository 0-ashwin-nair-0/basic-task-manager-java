# Task Manager Console Application

A simple command-line Task Management System built using Java and ArrayList. This project allows users to create, view, update, and delete tasks while managing task priorities and statuses.

## Overview

The application provides a menu-driven interface where users can:

* Add new tasks
* View all tasks
* Update task status
* Delete existing tasks
* Manage task priorities
* Track task progress

This project was developed to practice Java fundamentals, Object-Oriented Programming concepts, and collection frameworks.

---

## Features

### Add Tasks

Create new tasks with different priority levels:

* Low Priority
* Medium Priority
* High Priority

### View Tasks

Display all tasks along with:

* Task Name
* Priority
* Current Status

### Update Task Status

Change the status of a task to:

* New
* In Progress
* Completed

### Delete Tasks

Remove tasks from the task list by providing the task name.

---

## Technologies Used

* Java
* ArrayList Collection Framework
* Object-Oriented Programming
* Exception Handling
* Console-Based User Interface

---

## Project Structure

```text
src/
│
├── ArrayListExample.java
│   ├── Main Application
│   ├── User Menu
│   ├── Task Operations
│
└── Task.java
    ├── Task Model
    ├── Priority Management
    └── Status Management
```

---

## OOP Concepts Implemented

### Encapsulation

Task attributes are stored as private fields and accessed through methods.

```java
private String taskName;
private int priority;
private String status;
```

### Objects and Classes

The `Task` class represents individual tasks while the main application manages collections of tasks.

### Method Overriding

```java
@Override
public String toString()
```

Used to provide a meaningful representation of task objects.

---

## Sample Menu

```text
Press 1 to add a task.
Press 2 to view all tasks.
Press 3 to change the status of the task.
Press 4 to delete a task.
Press any other key to exit.
```

---

## Sample Output

```text
Press 1 to add a task.

Enter the task:
Complete Java Assignment

Priority:
1 - Low
2 - Medium
3 - High

Task Added Successfully!
```

```text
Your Tasks

1.) Complete Java Assignment 3 New
2.) Practice Collections Framework 2 In Progress
3.) Build Todo Project 3 Completed
```

---

## Learning Outcomes

Through this project, I practiced:

* Java Classes and Objects
* Constructors
* ArrayList Operations
* Searching and Updating Data
* Exception Handling
* User Input Validation
* Menu-Driven Program Design
* Basic Software Development Principles

---

## Future Improvements

Possible enhancements include:

* File Handling for data persistence
* Task deadlines and due dates
* Sorting by priority
* Search functionality
* Category-based tasks
* Priority validation
* Data storage using databases
* GUI implementation using Java Swing or JavaFX

---

## How to Run

### Compile

```bash
javac Task.java ArrayListExample.java
```

### Execute

```bash
java ArrayListExample
```

---

This project is part of my Java learning journey and demonstrates practical usage of Java Collections and Object-Oriented Programming concepts.
