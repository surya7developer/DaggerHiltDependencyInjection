package com.android.topic.newdaggerhiltdemo2024.repo.constructor_injection_example

import android.util.Log
import javax.inject.Inject

class LoggerService @Inject constructor(){
    fun log(tag:String,message:String){
        Log.d(tag, message)
    }
}