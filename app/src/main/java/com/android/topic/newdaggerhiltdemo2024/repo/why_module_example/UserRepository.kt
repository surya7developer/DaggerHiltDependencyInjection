package com.android.topic.newdaggerhiltdemo2024.repo.why_module_example

import android.util.Log
import javax.inject.Inject

interface UserRepository {
    fun printLog(tag: String, message: String)
}

class SQLRepository @Inject constructor() : UserRepository {
    override fun printLog(tag: String, message: String) {
        Log.d("UserRepository", "User Saved In DB")
    }
}

class FirebaseRepository @Inject constructor() : UserRepository {
    override fun printLog(tag: String, message: String) {
        Log.d("UserRepository", "User Saved In Firebase")
    }
}