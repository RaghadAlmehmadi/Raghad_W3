package com.example.classtask
fun main() {
    // object from class student
    val student1 = student("Raghad", 23, 100, "A")
    student1.displayInfo()
    println("Scholarship Eligible: ${student1.isEligible()}")

    // class data for Course information
    val course1 = course(courseName= "Programming", courseCode= "101", credits= 4)
    //toString()
    println("Course information: $course1")
    //copy()
    val course2 = course1.copy()
    println("Copied Course: $course2")
    //hashCode()
    println("HashCode of course1: ${course1.hashCode()}")
    //equals()
    println("course1 equals course2: ${course1 == course2}")

    //enum class for DepartmentType
    val department = DepartmentType.COMPUTER_SCIENCE
    val currentCredits = 12
    val courseCredits = 5
    println("Department: $department\nMax Credits: ${department.maxCredits}\n" +
            "Can register for course? ${department.canRegister(currentCredits, courseCredits)}")
}


// class person
open class person {
    var name: String
    var age: Int
    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }
    open fun displayInfo(){
        println("the name is $name,and age is $age")
    }
}
//interface ScholarshipEligible
interface ScholarshipEligible{
    fun isEligible(): Boolean
}
//subclass Student
class student(name: String, age: Int,var studentId: Int , var grade: String ) : person(name, age),ScholarshipEligible{
    override fun displayInfo() {
        println("the name is $name,and age is $age, the grade is $grade, and the student ID $studentId ")
    }
    override fun isEligible(): Boolean {
        return grade == "A" || grade == "B"
    }
}
