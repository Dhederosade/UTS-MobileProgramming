package com.revan.R18090091.helper

import android.content.Context
import android.content.SharedPreferences

class PreferencesHelper (context: Context) {

    private  val PREFS_NAME = "sharedprefkotlin12345"
    private  val sharedPreferences: SharedPreferences
    val editor: SharedPreferences.Editor

    init {
        sharedPreferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        editor = sharedPreferences.edit()
    }

    fun put(key: String,value: String){
        editor.putString(key, value)
            .apply()

    }

    fun  getString(key: String) :String?{
        return  sharedPreferences.getString(key,null)
    }

    fun put(key: String,value: Boolean){
        editor.putBoolean(key, value)
            .apply()

    }

    fun  getBoolean(key: String) :Boolean{
        return  sharedPreferences.getBoolean(key,false)
    }

    fun clear(){
        editor.clear()
            .apply()
    }
}
