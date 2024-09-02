package com.android.topic.newdaggerhiltdemo2024.repo.field_injection_example

import android.util.Log
import javax.inject.Inject


class FiledInjectionExampleRepository @Inject constructor(){

    fun saveUser(message:String){
        Log.d("MainActivity","$message")
    }
}