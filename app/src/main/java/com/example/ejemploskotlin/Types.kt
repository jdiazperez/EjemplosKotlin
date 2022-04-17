package com.diagroup.storecatalog.data.local.converters

class Types {

    companion object {
        fun example() {
            val one : Int = 1
            val oneLong : Long = 1L
            val pi : Float = 3.1416F
            val piDouble: Double = 3.1416
        }

        fun example2() {
            val one = 1
            val oneLong = 1L
            val pi = 3.1416F
            val piDouble = 3.1416
        }

        fun example3() {
            val myTrue : Boolean = true
            val myFalse = false
        }

        fun example4() {
            val aChar : Char = 'a'
            val newLine = '\n'
            val string : String = "cadena de caracteres"
        }

        fun example5() {
            var mutableInt = 1
            mutableInt = 2
            val inmutableInt = 1
            //inmutableInt = 2 // Error de compilación: val cannot be reassigned
        }
    }
}