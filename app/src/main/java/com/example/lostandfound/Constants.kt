package com.example.lostandfound

object Constants {
    // Arraylist and return the Arraylist
    fun getEmployeeData(): ArrayList<ClaimModel> {
        // create an arraylist of type employee class
        val employeeList = ArrayList<ClaimModel>()
        val emp1 = ClaimModel("David Rukenya", "drukenya@gmail.com", "98%")
        employeeList.add(emp1)
        val emp2 = ClaimModel("Evangel Njeri", "enjeri@gmail.com", "97%")
        employeeList.add(emp2)
        val emp3 = ClaimModel("Peterson Edwin", "pedwin@gmail.com", "94%")
        employeeList.add(emp3)
        val emp4 = ClaimModel("Salome Njambi", "snjambi@gmail.com", "92%")
        employeeList.add(emp4)
        val emp5 = ClaimModel("Hannah Koech", "hkoech@gmail.com", "85%")
        employeeList.add(emp5)
        val emp6 = ClaimModel("Jane Peter", "jpeter@gmail.com", "80%")
        employeeList.add(emp6)
        val emp7 = ClaimModel("Rosemary Bill", "rbill@gmail.com", "75%")
        employeeList.add(emp7)
        val emp8 = ClaimModel("Khalid Bensio", "kbensio@gmail.com", "64%")
        employeeList.add(emp8)

        return employeeList
    }
}