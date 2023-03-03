package com.example.littlelemonlogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.littlelemonlogin.ui.theme.LittleLemonLoginTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LittleLemonLoginTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    LoginScreen()
                }
            }
        }
    }
}
@Composable
fun LoginScreen(){
    var userName by remember {
        mutableStateOf(0)
    }

    var mdp by remember {
        mutableStateOf(0)
    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(
                id = R.drawable.littlelemonlogo),
            contentDescription = "Logo Image",
            modifier = Modifier
                .padding(10.dp)
        )
        TextField(
            value = "",
            onValueChange = {},
            label = { Text(text = "Username") },
            modifier = Modifier
                .padding(10.dp)
        )
        TextField(
            value = mdp.toString(),  // première option
            onValueChange = {  }, // deuxième option
            label = { Text(text = "Password") },
            modifier = Modifier
                .padding(10.dp)
        )
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(
                Color(0xFF495E57),


            )
        ) {
            Text(
                text = "Login",
                color = Color(0xFFEDEFEE),
                modifier = Modifier
                    .padding(10.dp)
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun LoginScreenPreview(){
    LoginScreen()
}