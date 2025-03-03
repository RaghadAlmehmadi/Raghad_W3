package com.example.classtask

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.classtask.ui.theme.ClasstaskTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ClasstaskTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        Log.d("MainActivity", "onCreate: Activity is being created")


    }

    override fun onStart() {
        super.onStart()
        Log.d("MainActivity", "onStart: Activity is now visible")

    }

    override fun onResume() {
        super.onResume()
        Log.d("MainActivity", "onResume: Activity is now interactive")

    }


    override fun onPause() {
        super.onPause()
        Log.d("MainActivity", "onPause: Activity is partially visible")


    }

    override fun onStop() {
        super.onStop()
        Log.d("MainActivity", "onStop: Activity is no longer visible")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MainActivity", "onDestroy: Activity is being destroyed")

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
    ClasstaskTheme {
        Greeting("Android")
    }
}