package com.android.topic.newdaggerhiltdemo2024.repo.constructor_injection_example

import javax.inject.Inject

class ConstructorInjectionExampleRepository @Inject constructor(private val loggerService: LoggerService) {

    fun printLog(tag:String,message:String){
        loggerService.log(tag,message)
    }
}