package com.example.ejemploskotlin

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lambdas()
    }

    fun lambdas() {
        val numberList = listOf(1, 2, 3, 4, 5)

        // La función filter recorre la lista y a cada elemento (number) le aplica el predicado.
        // Si el número cumple el predicado, es añadido a la lista que se devuelve como resultado.
        val evenNumbersList = numberList.filter({ number -> number % 2 == 0 })

        // Imprime la lista de pares [2, 4]
        Log.i("EvenNumbers", evenNumbersList.toString())
    }
}