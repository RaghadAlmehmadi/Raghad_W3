package com.example.classtask

enum class DepartmentType(val maxCredits: Int){
    COMPUTER_SCIENCE(15),
    MATHEMATICS(20),
    PHYSICS(25),
    ENGINEERING(10);

    fun canRegister(currentCredits: Int, courseCredits: Int): Boolean {
        return currentCredits + courseCredits <= maxCredits
    }
} 