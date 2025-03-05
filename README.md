Description
This Kotlin project demonstrates basic OOP concepts like classes, inheritance, interfaces, data classes, enum classes, and functions. It simulates managing student and course data, including scholarship eligibility, course registration, and basic object operations such as toString(), copy(), hashCode(), and equals().
Features
Person Class: Represents a person with a name and age.
Student Class: Inherits from Person, adds studentId and grade, and implements ScholarshipEligible interface.
Course Class: Data class for course details (courseName, courseCode, credits).
DepartmentType Enum: Represents departments with a max credit limit and method to check if a student can register based on credits.
Technologies Used
Kotlin: Programming language
Android Studio: IDE
Classes Overview
Person: Holds name and age, with a method displayInfo().
Student: Inherits Person, adds studentId and grade, implements isEligible() for scholarship eligibility.
Course: Data class for course details (courseName, courseCode, credits), with default methods (toString(), copy(), hashCode(), equals()).
DepartmentType: Enum with departments and a canRegister() method to check registration eligibility.
Methods
Student.displayInfo(): Displays student's name, age, grade, and ID.
Student.isEligible(): Returns true if grade is "A" or "B".
Course.toString(): Returns course details as a string.
Course.copy(): Creates a copy of the course.
Course.hashCode(): Returns hash code for the course.
Course.equals(): Compares two course objects.
DepartmentType.canRegister(): Checks if the student can register for a course based on credit limits.
<img width="1440" alt="kotlin_oop" src="https://github.com/user-attachments/assets/fa896b09-34ce-44c1-a432-105d45859c88" />

