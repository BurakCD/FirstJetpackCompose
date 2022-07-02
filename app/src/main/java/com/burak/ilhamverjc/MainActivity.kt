package com.burak.ilhamverjc

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.burak.ilhamverjc.ui.theme.IlhamVerJCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IlhamVerJCTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Sayfa()
                }
            }
        }
    }
}

@Composable
fun Sayfa() {  
    Scaffold(topBar = {
        TopAppBar(
            title = { Text(text = "İlham ver") },
            backgroundColor = colorResource(id = R.color.anaRenk),
            contentColor = colorResource(id = R.color.white)
        )
    }, content = {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Image(painter = painterResource(id = R.drawable.stevejobs),
                contentDescription = "Steve Jobs" )
            Text(text = "Steve Jobs",
                color = Color.Red,
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp)
            
        }
            Text(
                text = "Light cannot exists without darkness",
                modifier = Modifier.padding(all = 10.dp),
                textAlign = TextAlign.Center, color = Color.Red
            )
            Button(onClick = {Log.e("Button","Buton çalıştı")},
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.Red,
                    contentColor = Color.White)
            ) {
                Text(text = "İlham ver")
            }
        }
    }
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    IlhamVerJCTheme {
        Sayfa()
    }
}