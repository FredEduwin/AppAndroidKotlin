package com.example.calculadora.data.utils

import android.content.Context
import android.content.SharedPreferences

class Prefs(context:Context) {
    val PREFS_NAME = "String inicial"
    val SHARED_NAME = "String intercambiable"

    val PREFS_JWT = "String inicial"
    val SHARED_JWT = "String intercambiable"

    val prefsName: SharedPreferences = context.getSharedPreferences(PREFS_NAME, 0)
    val prefsJWT: SharedPreferences = context.getSharedPreferences(PREFS_JWT, 0)

    var name: String
        get() = prefsName.getString(SHARED_NAME, "").toString()
        set(value) =prefsName.edit().putString(SHARED_NAME, value).apply()

    var jwt: String
        get() = prefsJWT.getString(SHARED_JWT, "").toString()
        set(value) = prefsJWT.edit().putString(SHARED_JWT, value).apply()

}