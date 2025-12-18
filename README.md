# Assignment 1: Object-Oriented Student Management System

## A. Project Overview

This project is a simple **Object-Oriented Student Management System** implemented in Java. The goal is to demonstrate core OOP principles such as **encapsulation, abstraction, data hiding**, and **composition**, while also practicing Java fundamentals including variables, conditions, loops, arrays, and methods.

The system models real-world academic entities using two main classes: `Student` and `Course`. A driver program (`Main`) is used to create objects, process arrays of students, and display computed results.

---

## B. Class Descriptions

### 1. Student Class

The `Student` class represents an individual student and stores academic information.

**Fields:**

* `name` – full name of the student
* `id` – unique student ID
* `major` – academic program
* `gpa` – current GPA
* `credits` – total earned credits

All fields are declared `private` to enforce encapsulation.

**Constructor:**
Initializes `name`, `id`, and `major`. GPA is set to `0.0` and credits to `0` by default.

**Key Methods:**

* Getters and setters for controlled access to fields
* `addCredits(int c)` – increases earned credits
* `updateGPA(double newGPA)` – updates GPA with validation
* `isHonors()` – returns `true` if GPA ≥ 3.5
* `toString()` – returns a formatted string with student details

---

### 2. Course Class

The `Course` class represents a university course and demonstrates **composition** by containing an array of `Student` objects.

**Fields:**

* `courseName` – course title
* `instructor` – instructor name
* `students[]` – array of enrolled students

**Constructor:**
Initializes course name, instructor, and allocates an array of students with a given size.

**Key Methods:**

* `addStudent(Student s, int index)` – safely inserts a student into the array
* `courseAverageGPA()` – computes the average GPA of enrolled students
* `highestCreditStudent()` – returns the student with the highest credits
* `toString()` – returns a summary of the course

---

### 3. Main (Driver Program)

The `Main` class is responsible for:

* Creating multiple `Student` objects
* Modifying GPA and credits
* Printing student details
* Creating a `Course` and adding students
* Computing and displaying:

  * Average course GPA
  * Student with highest credits
  * Top GPA student
  * Number of honors students
  * Total credits earned

Static methods are used to process arrays of students as required in Part 2.

---

## C. Instructions to Compile and Run

From the project root directory:

```bash
javac src/*.java
java -cp src Main
```

---

## D. Screenshots

Screenshots demonstrating the program output are included in the `docs/screenshots` directory.

![App Screenshot](docs/screenshots/Снимок%20экрана%202025-12-17%20215650.png)

They show:

* Printed student details
* Average GPA calculation
* Highest credit student
* Results of array processing methods

---

## E. Reflection

Working on this project helped me better understand how Object-Oriented Programming concepts are applied in real applications. I learned how encapsulation protects data integrity and how composition allows classes to work together in a structured way. Implementing getters and setters reinforced the importance of controlled access to class fields.

One of the main challenges was designing methods that safely process arrays of objects while avoiding errors such as invalid indices or null values. Overall, this project demonstrated how clean OOP design leads to readable, maintainable, and scalable code.

---

## Repository Structure

```
assignment1-student-management/
├── src/
│   ├── Student.java
│   ├── Course.java
│   └── Main.java
├── docs/
│   └── screenshots/
├── README.md
└── .gitignore
```
