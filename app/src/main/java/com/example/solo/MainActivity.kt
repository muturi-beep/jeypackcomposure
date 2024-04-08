@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.solo

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.solo.ui.theme.SoloTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SoloTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    // Greeting("Solomon")
                    login()
                }
            }
        }
    }
}

@Composable
fun login() {

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val context = LocalContext.current

    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .background(Color.Red)) {
        Text(text = "The Reds",
            color = Color.Blue,
            fontSize = 80.sp,
            fontFamily = FontFamily.Cursive
        )
        OutlinedTextField(
            value = email,
            onValueChange = {email = it},
            leadingIcon = { Icon(imageVector = Icons.Default.Email,
                contentDescription = "Email" )},
            label = { Text(text = "Email Address", color = Color.Cyan)},
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 20.dp),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
            keyboardActions = KeyboardActions(),
        )

        OutlinedTextField(
            value = password,
            onValueChange = {password = it},
            leadingIcon = { Icon(imageVector = Icons.Default.Lock,
                contentDescription = "Password" )},
            label = { Text(text = "Password", color = Color.Cyan)},
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 20.dp),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
            keyboardActions = KeyboardActions()
        )
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth()) {

            Text(text = "Login",
                fontSize = 22.sp)
        }

        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            val intent=Intent(context,RegisterActivity::class.java)
            context.startActivity(intent)

            },
            modifier = Modifier.fillMaxWidth()) {

            Text(text = "Click To SignUp",
                fontSize = 22.sp)
        }

        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            val intent=Intent(context,IntentActivity::class.java)
            context.startActivity(intent)

        },
            modifier = Modifier.fillMaxWidth()) {

            Text(text = "Intent Examples",
                fontSize = 22.sp)
        }

        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            val intent=Intent(context,SimpleListViewActivity::class.java)
            context.startActivity(intent)

        },
            modifier = Modifier.fillMaxWidth()) {

            Text(text = "Simple List View",
                fontSize = 22.sp)
        }

        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            val intent=Intent(context,RecyclerViewActivity::class.java)
            context.startActivity(intent)

        },
            modifier = Modifier.fillMaxWidth()) {

            Text(text = "Recycler View",
                fontSize = 22.sp)
        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
            val intent=Intent(context,CustomListViewActivity::class.java)
            context.startActivity(intent)

        },
            modifier = Modifier.fillMaxWidth()) {

            Text(text = "Custom View",
                fontSize = 22.sp)
        }


    }
}

@Preview
@Composable
private fun loginprev() {
    login()
}