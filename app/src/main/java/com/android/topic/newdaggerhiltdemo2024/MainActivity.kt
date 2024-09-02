package com.android.topic.newdaggerhiltdemo2024

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.android.topic.newdaggerhiltdemo2024.repo.constructor_injection_example.ConstructorInjectionExampleRepository
import com.android.topic.newdaggerhiltdemo2024.repo.field_injection_example.FiledInjectionExampleRepository
import com.android.topic.newdaggerhiltdemo2024.repo.why_module_example.UserRepository
import com.android.topic.newdaggerhiltdemo2024.ui.theme.NewDaggerHiltDemo2024Theme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    //@Inject
    //lateinit var filedInjectionExampleRepository: FiledInjectionExampleRepository
//
    //@Inject
    //lateinit var constructorInjectionExampleRepository: ConstructorInjectionExampleRepository

    @Inject
    lateinit var userRepository: UserRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewDaggerHiltDemo2024Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")

                   // filedInjectionExampleRepository.saveUser("This Is Field Injection")
                   // constructorInjectionExampleRepository.printLog("MainActivity","This Is Constructor Injection Example")

                    userRepository.printLog("UserRepository","This is interface Object")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NewDaggerHiltDemo2024Theme {
        Greeting("Android")
    }
}