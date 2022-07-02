package com.burak.ilhamverjc

import android.os.Bundle
import android.util.Log
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.burak.ilhamverjc.ui.theme.IlhamVerJCTheme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IlhamVerJCTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Sayfa2()
                }
            }
        }
    }
}

@Composable
fun Sayfa2() {
    Scaffold(content = {
        Surface(color = MaterialTheme.colors.primary) {
            val tfKullaniciAdi = remember {
                mutableStateOf("")
            }
            val tfSifre = remember {
                mutableStateOf("")
            }
            Column(
                modifier = Modifier
                    .background(colorResource(id = R.color.purple_500))
                    .fillMaxSize(),
                verticalArrangement = Arrangement.SpaceEvenly,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(painter = painterResource(id = R.drawable.logo), contentDescription = "Logo")
                TextField(
                    value = tfKullaniciAdi.value,
                    onValueChange = { tfKullaniciAdi.value = it },
                    label = { Text(text = "Kullanıcı Adı") },
                    colors = TextFieldDefaults.textFieldColors(
                        backgroundColor = Color.White,
                        textColor = Color.Black,
                        focusedIndicatorColor = Color.Red
                    )
                )
                TextField(
                    value = tfSifre.value,
                    onValueChange = { tfSifre.value = it },
                    label = { Text(text = "Şifre") },
                    colors = TextFieldDefaults.textFieldColors(
                        backgroundColor = Color.White,
                        textColor = Color.Black,
                        focusedIndicatorColor = Color.Red
                    )
                )
                Button(
                    onClick = { Log.e("Button", "Çalıştı") },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.Gray,
                        contentColor = Color.Red
                    ),
                    modifier = Modifier.size(250.dp, 50.dp)
                ) {
                    Text(text = "Giriş Yap")
                }
            }

        }
    })
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    IlhamVerJCTheme {
        Sayfa2()
    }
}