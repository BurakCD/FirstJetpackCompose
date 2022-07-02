package com.burak.ilhamverjc

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.burak.ilhamverjc.ui.theme.IlhamVerJCTheme

class YemekTarifi : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IlhamVerJCTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Sayfa3()
                }
            }
        }
    }
}

@Composable
fun Sayfa3() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { icerik(yazi = "Yemek Tarifi")},
                backgroundColor = colorResource(id = R.color.begenRenk),
                navigationIcon = { R.drawable.ic_baseline_arrow_back_24 },
                contentColor = Color.Black
            )},
        content = {
            Column(
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally, 
                modifier = Modifier.fillMaxSize()
            ){
                Image(
                    painter = painterResource(id = R.drawable.yemekresim),
                    contentDescription = "Yemek Resim")
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)) {
                    Button(
                        onClick = { Log.e("Button1", "Çalıştı")},
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = colorResource(id = R.color.begenRenk),
                            contentColor = Color.Black
                        ),
                        modifier = Modifier.weight(50f)
                    ) {
                        icerik(yazi = "Beğen")
                    }
                    Button(
                        onClick = { Log.e("Button2", "Çalıştı")},
                        colors = ButtonDefaults.buttonColors(
                            backgroundColor = colorResource(id = R.color.yorumYapRenk),
                            contentColor = Color.Black
                        ),
                        modifier = Modifier.weight(50f)
                    ) {
                        icerik(yazi = "Yorum Yap")
                    }
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(all = 10.dp)) {
                    Text(
                        text = "Köfte",
                        color = colorResource(id = R.color.begenRenk),
                        fontSize = 18.sp)
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        icerik(yazi = "Izgaraya uygun")
                        icerik(yazi = "4 Mart")
                    }
                }
                Text(
                    text = "Köfte harcını hazırlamak için, soğanları rendeleyin" +
                            " ve maydanozları ince ince kıyın. " +
                            "İsterseniz bir diş sarımsak da ekleyebilirsiniz.",
                    modifier = Modifier.padding(all = 10.dp),
                    textAlign = TextAlign.Center
                )
            }
        }
    )
}
@Composable
fun icerik(yazi:String){
    Text(text = yazi)
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview3() {
    IlhamVerJCTheme {
        Sayfa3()
    }
}