# Student Manager App - Part 3: IO and Exception Handling

![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg?style=flat-square)

A Java console application that manages student records with full CSV file input/output and robust exception handling. This is Part 3 of a multi-part Student Manager series, focusing on reading from and writing to CSV files using buffered streams, along with comprehensive try-catch-finally error handling.

## Overview

This application demonstrates core Java I/O and exception handling concepts through a practical student records management system. Students are stored as objects in an `ArrayList` and can be persisted to and loaded from CSV files. The project showcases `FileReader`, `FileWriter`, `BufferedReader`, `BufferedWriter`, and structured exception handling with `try-catch-finally` blocks.

## Features

- **CSV File Reading** -- Load student records from a CSV file using `BufferedReader`
- **CSV File Writing** -- Persist student records to a CSV file using `BufferedWriter`
- **Exception Handling** -- Comprehensive `try-catch-finally` blocks for `IOException`, `FileNotFoundException`, and `NullPointerException`
- **Student CRUD Operations** -- Add, remove, update, and search student records
- **Input Validation** -- Validates student ID format (`G00XXXXXX`), name, and age
- **Search & Filter** -- Find students by name, age, name-and-age combination, or age range

## Prerequisites

- **Java JDK** 11 or higher
- A Java IDE (Eclipse, IntelliJ IDEA, VS Code) or command-line access

## Getting Started

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/danielcregg/student-manager-app-part3-IOandExceptionHandling.git
   cd student-manager-app-part3-IOandExceptionHandling
   ```

2. Open the project in your preferred Java IDE, or compile from the command line.

### Usage

**Compile and run from the command line:**

```bash
javac -d bin src/ie/atu/studentmanagerpackage/*.java
java -cp bin ie.atu.studentmanagerpackage.Main
```

The application will read student data from `resources/students.csv`, perform various operations (add, update, search), and write the updated records back to the CSV file.

## Tech Stack

- **Language:** Java
- **I/O:** `java.io` (FileReader, FileWriter, BufferedReader, BufferedWriter)
- **Data Structures:** `java.util.ArrayList`
- **Dev Environment:** Gitpod / VS Code Dev Containers

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
