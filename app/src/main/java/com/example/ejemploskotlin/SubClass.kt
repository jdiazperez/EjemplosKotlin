package com.diagroup.storecatalog.data.local.converters

import android.util.Log

class SubClass : SuperClass() {

    override fun superMethod() {
        Log.i("Sub", "superMethod")
    }

    fun subMethod() {
        Log.i("Sub", "subMethod")
    }
}