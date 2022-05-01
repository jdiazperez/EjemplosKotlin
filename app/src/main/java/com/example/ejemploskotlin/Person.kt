package com.example.ejemploskotlin

import android.util.Log

data class Person(
    val firstName: String = "Jorge",
    val surname: String = "Díaz Pérez",
    val age: Int = 28
) {

    companion object {
        fun test() {
            val person1 = Person()
            Log.i(
                "person1",
                person1.toString()
            ) // Imprime “Person(firstName= Jorge, surname=Díaz Pérez, age=28)”

            val person2 = Person("Jose", "García García")
            Log.i(
                "person2",
                person2.toString()
            ) // Imprime “Person(firstName= Jose, surname=García García, age=28)”

            val person3 = Person(age = 0)
            Log.i(
                "person3",
                person3.toString()
            ) // Imprime “Person(firstName= Jorge, surname=Díaz Pérez, age=0)”
        }
    }
}
