package com.example.classtask

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableLongStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import com.example.classtask.ui.theme.ClasstaskTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


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
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {

    var counter: MutableState<Int> = remember {
        mutableStateOf(0)
    }

    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalAlignment  = Alignment.Top
    ) {

        Box(
            modifier = Modifier,
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.profile_imag),
                contentDescription = "Profile Picture",

            )

        }

        Column(
            modifier = Modifier
                .fillMaxSize(),
           horizontalAlignment = Alignment.Start



        ) {
            Text(
                text = "Raghad",
                modifier = modifier,
                color = Color.Black,
                fontSize = 32.sp,
                textAlign = TextAlign.Justify

            )
            Text(
                text = "major: computer since",
                modifier = modifier,
                color = Color.Black,
                fontSize = 22.sp,
                textAlign = TextAlign.Justify

                )
            Button(modifier = Modifier,
                colors = ButtonDefaults.buttonColors(Color.Blue),
                onClick = {
                counter.value = if (counter.value == 0) 1 else 0
            }) {
                Text(if (counter.value > 0) "Following" else "Follow")
            }
            Text(
                text = "Followers: ${counter.value}",
                color = Color.Black,
                fontSize = 18.sp
            )

        }
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ClasstaskTheme {
        Greeting("Android")
    }
}
