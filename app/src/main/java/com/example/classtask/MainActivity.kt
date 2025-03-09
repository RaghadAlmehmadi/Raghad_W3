package com.example.classtask

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableLongStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
import androidx.compose.ui.text.font.FontWeight
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
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White),
        contentAlignment = Alignment.TopEnd
    ){
        Image(
            painter = painterResource(id = R.drawable.taskclass),
            contentDescription = "Picture",
            modifier = Modifier
                .padding(10.dp)
                .size(85.dp),
            contentScale = ContentScale.Crop
        )
    }

    Column(

        modifier = Modifier
            .padding(16.dp),
        verticalArrangement = Arrangement.Top
    ) {
        Spacer(modifier = Modifier.height(80.dp))
        Text(
            text="Log in ",
            modifier = Modifier
            ,fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xff3C5A99),
            textAlign = TextAlign.Left
        )
        Spacer(modifier = Modifier.height(25.dp))
        Text(
            text="Username",
            fontSize = 20.sp,
            color = Color.Black
        )
        OutlinedTextField(
            value = username,
            onValueChange = { username = it },
            label = { Text("") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )
        Spacer(modifier = Modifier.height(25.dp))
        Text(
            text="Password",
            fontSize = 20.sp,
            color = Color.Black
        )
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("") },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )
        Spacer(modifier = Modifier.height(15.dp))
        Text(
            text="Forget Password?",
            modifier = Modifier
                .align(Alignment.End),
            fontSize = 20.sp,
            color = Color.Black ,

            )
        Spacer(modifier = Modifier.height(15.dp))
        Button(onClick = { },
            modifier = Modifier
                .fillMaxWidth()
                .padding(3.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xff3C5A99)))
        {
            Text("Log in ", color = Color.White)
        }
        Spacer(modifier = Modifier.height(25.dp))
        Text(
            text="Create new account",
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            fontSize = 25.sp,
            color = Color.Black ,

            )
        Spacer(modifier = Modifier.height(45.dp))
        Text(
            text="Or login with",
            modifier = Modifier
                .align(Alignment.CenterHorizontally),
            fontSize = 20.sp,
            color = Color.Black ,

            )
        Spacer(modifier = Modifier.height(25.dp))
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Box(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .background(Color.White),
                contentAlignment = Alignment.CenterStart
            ){
                Image(
                    painter = painterResource(id = R.drawable.facebook),
                    contentDescription = "FaceBook Picture",
                    modifier = Modifier
                        .padding(10.dp)
                        .size(35.dp),
                    contentScale = ContentScale.Crop
                )
            }
            Box(
                modifier = Modifier
                    .weight(1f)
                    .align(Alignment.CenterVertically)
                    .background(Color.White),
                contentAlignment = Alignment.Center

            ){
                Image(
                    painter = painterResource(id = R.drawable.google),
                    contentDescription = "Google Picture",
                    modifier = Modifier
                        .padding(10.dp)
                        .size(35.dp),
                    contentScale = ContentScale.Crop
                )
            }
            Box(
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .background(Color.White),
                contentAlignment = Alignment.CenterEnd
            ){
                Image(
                    painter = painterResource(id = R.drawable.apple),
                    contentDescription = "apple Picture",
                    modifier = Modifier
                        .padding(10.dp)
                        .size(35.dp),
                    contentScale = ContentScale.Crop
                )
            }
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
