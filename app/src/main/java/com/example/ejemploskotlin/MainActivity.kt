package com.example.ejemploskotlin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //lambdas()
        collectionFunctions()
    }

    fun lambdas() {
        val numberList = listOf(1, 2, 3, 4, 5)

        // La función filter recorre la lista y a cada elemento (number) le aplica el predicado.
        // Si el número cumple el predicado, es añadido a la lista que se devuelve como resultado.
        val evenNumbersList = numberList.filter({ number -> number % 2 == 0 })

        // Imprime la lista de pares [2, 4]
        Log.i("EvenNumbers", evenNumbersList.toString())
    }

    fun collectionFunctions() {
        val numberList = listOf(1, 2, 3, 4, 5)
        val multipleOf2List = numberList.map { it * 2 }

        // Imprime la lista de múltiplos del 2 [2, 4, 6, 8, 10]
        Log.i("multiplesOf2", multipleOf2List.toString())

        val numberList2 = listOf(1, 2, 3, 4, 5)
        val anyEven = numberList2.any { it % 2 == 0 }
        Log.i("even", "Hay algún par: $anyEven")

        val numberList3 = listOf(1, 2, 3, 4, 5)
        val firstEven = numberList3.find { it % 2 == 0 }

        // Imprime el primer número par: 2
        Log.i("firstEven", "El primer par es: $firstEven")

        val numberList4 = listOf(1, 2, 3, 4, 5)
        val evenCount = numberList4.count { it % 2 == 0 }

        // Imprime: Hay 2 números pares
        Log.i("evenCount", "Hay $firstEven números pares")

        val peopleList = listOf(
            Person("Jorge", "Díaz", 28),
            Person("José", "García", 19),
            Person("María", "Fernández", 28),
            Person("David", "González", 62)
        )
        val peopleByAgeMap = peopleList.groupBy { it.age }
        // Imprime: {28=[Person(firstName=Jorge, surname=Díaz, age=28), Person(firstName=María, surname=Fernández, age=28)], 19=[Person(firstName=José, surname=García, age=19)], 62=[Person(firstName=David, surname=González, age=62)]}
        Log.i("peopleByAge", peopleByAgeMap.toString())
    }
}