package com.example.foodapp

import android.content.Context

class SharePref(context: Context) {
    companion object {
        private const val FILE_KEY = "settings"
        private const val FontSize = "fontSize"

    }

    private val sharedPref = context.getSharedPreferences(FILE_KEY, Context.MODE_PRIVATE)

    fun saveFontSize(name: Float){
        sharedPref.edit()
            .putFloat(FontSize, name)
            .apply()
    }

    fun getFontSize(): Float {
        return sharedPref.getFloat(FontSize, 18f)
    }
}