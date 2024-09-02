package com.android.topic.newdaggerhiltdemo2024.appmodule

import com.android.topic.newdaggerhiltdemo2024.repo.why_module_example.FirebaseRepository
import com.android.topic.newdaggerhiltdemo2024.repo.why_module_example.SQLRepository
import com.android.topic.newdaggerhiltdemo2024.repo.why_module_example.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun getUserRepository () : UserRepository {
        return FirebaseRepository()
    }
}