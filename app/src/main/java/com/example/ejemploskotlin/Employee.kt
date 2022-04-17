package com.diagroup.storecatalog.data.local.converters

sealed class Employee(val employeeNumber: Int, val firstName: String, val surname: String) {

    class Developer(employeeNumber: Int, firstName: String, surname: String) :
        Employee(employeeNumber, firstName, surname)

    class ProjectManager(
        employeeNumber: Int,
        firstName: String,
        surname: String,
        val team: String,
        val employees: List<Developer>
    ) : Employee(employeeNumber, firstName, surname)

    class ScrumMaster(firstName: String, surname: String, val designatedTeams: List<String>) :
        Employee(0, firstName, surname)

    companion object {
        fun printInformation(employee: Employee) {
            val message: String
            when (employee) {
                is Developer -> {
                    message = "Desarrolador: nombre: ${employee.firstName}"
                }
                is ProjectManager -> {
                    message =
                        "Jefe de proyecto: nombre: ${employee.firstName}, equipo: ${employee.team}"
                }
                is ScrumMaster -> {
                    message =
                        "Scrum Master: nombre: ${employee.firstName}, equipos designados: ${employee.designatedTeams}"
                }
            }
        }
    }
}
