package com.diagroup.storecatalog.data.local.converters

import android.util.Log

class Collections {

    companion object {
        fun example() {
            val list = listOf("Star Wars", "El señor de los anillos", "Harry Potter")
            Log.i("list", "La primera película es: ${list[0]}")
            //list.add("") // Error de compilación
            //list.remove() // Error de compilación

            val mutableList = mutableListOf("Star Wars", "El señor de los anillos", "Harry Potter")
            Log.i("mutableList", "La primera película es: ${mutableList[0]}")
            mutableList.add("Titanic")
            mutableList.remove("Star Wars")
        }
    }
}