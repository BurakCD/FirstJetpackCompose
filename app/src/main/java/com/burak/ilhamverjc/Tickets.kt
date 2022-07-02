package com.burak.ilhamverjc

import android.graphics.Matrix
import android.graphics.RectF
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asComposePath
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.PathParser
import com.burak.ilhamverjc.ui.theme.IlhamVerJCTheme

class Tickets : ComponentActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IlhamVerJCTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Sayfa4()
                }
            }
        }
    }
}

@Composable
fun Sayfa4(){
    Scaffold( topBar = {
        TopAppBar(
            title = { icerik(yazi = "Tickets")},
            backgroundColor = colorResource(id = R.color.purple_500),
            contentColor = Color.White
        )},
        content = {
            Column(verticalArrangement = Arrangement.Top){
                Box(


                    modifier = Modifier

                        .width(428.dp)
                        .height(87.dp)
                        .clip(
                            RoundedCornerShape(
                                topStart = 0.dp,
                                topEnd = 0.dp,
                                bottomStart = 0.dp,
                                bottomEnd = 0.dp
                            )
                        )
                        .background(Color.Transparent)

                        .padding(start = 0.dp, top = 0.dp, end = 0.dp, bottom = 0.dp)

                        .alpha(1f)


                ) {

                    Canvas(
                        modifier = Modifier
                            .width(428.dp)
                            .height(0.dp)
                            //.fillMaxWidth()
                            //.aspectRatio(1f)
                            .align(Alignment.Center)
                    ) {
                        val fillPath = PathParser.createPathFromPathData("M 0 0 L 428 0 ")
                        //fillPath.fillType = Path.FillType.EVEN_ODD
                        val rectF = RectF()
                        fillPath.computeBounds(rectF, true)
                        val matrix = Matrix()
                        val scale = minOf( size.width / rectF.width(), size.height / rectF.height() )
                        matrix.setScale(scale, scale)
                        fillPath.transform(matrix)
                        val composePathFill = fillPath.asComposePath()

                    }

                    Text(
                        text = "Updated 1 day ago",
                        textAlign = TextAlign.Start,
                        fontSize = 12.sp,
                        textDecoration = TextDecoration.None,
                        letterSpacing = 0.10000000149011612.sp,
                        lineHeight = 16.sp,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier
                            .align(Alignment.Center)
                            .width(372.dp)

                            //.height(16.dp)

                            .alpha(1f),
                        color = Color(red = 0.6491666436195374f, green = 0.6577082872390747f, blue = 0.6833333373069763f, alpha = 1f),
                        fontWeight = FontWeight.Normal,
                        fontStyle = FontStyle.Normal,
                    )


                    Text(
                        text = "on 24.05.2019",
                        textAlign = TextAlign.Start,
                        fontSize = 12.sp,
                        textDecoration = TextDecoration.None,
                        letterSpacing = 0.10000000149011612.sp,
                        lineHeight = 16.sp,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier
                            .align(Alignment.BottomEnd)
                            .width(89.dp)

                            //.height(16.dp)

                            .alpha(1f),
                        color = Color(red = 0.6491666436195374f, green = 0.6577082872390747f, blue = 0.6833333373069763f, alpha = 1f),
                        fontWeight = FontWeight.Normal,
                        fontStyle = FontStyle.Normal,
                    )


                    Text(
                        text = "Jason Schreier",
                        textAlign = TextAlign.Start,
                        fontSize = 14.sp,
                        textDecoration = TextDecoration.None,
                        letterSpacing = 0.20000000298023224.sp,
                        lineHeight = 20.sp,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier
                            .align(Alignment.BottomStart)
                            .width(98.dp)

                            //.height(20.dp)

                            .alpha(1f),
                        color = Color(red = 0.14509804546833038f, green = 0.15294118225574493f, blue = 0.20000000298023224f, alpha = 1f),
                        fontWeight = FontWeight.SemiBold,
                        fontStyle = FontStyle.Normal,
                    )

                    Box(
                        modifier = Modifier
                            .width(54.dp)
                            .height(24.dp)
                            .clip(
                                RoundedCornerShape(
                                    topStart = 100.dp,
                                    topEnd = 100.dp,
                                    bottomStart = 100.dp,
                                    bottomEnd = 100.dp
                                )
                            )
                            .align(Alignment.Center)

                            .background(
                                Color(
                                    red = 0.9450980424880981f,
                                    green = 0.16862745583057404f,
                                    blue = 0.1725490242242813f,
                                    alpha = 1f
                                )
                            )
                    )

                    Text(
                        text = "High",
                        textAlign = TextAlign.Center,
                        fontSize = 11.sp,
                        textDecoration = TextDecoration.None,
                        letterSpacing = 0.5.sp,

                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier
                            .align(Alignment.Center)
                            .width(30.dp)

                            //.height(14.dp)

                            .alpha(1f),
                        color = Color(red = 1f, green = 1f, blue = 1f, alpha = 1f),
                        fontWeight = FontWeight.Bold,
                        fontStyle = FontStyle.Normal,
                    )

                    Box(


                        modifier = Modifier

                            .width(428.dp)
                            .height(87.dp)
                            .clip(
                                RoundedCornerShape(
                                    topStart = 0.dp,
                                    topEnd = 0.dp,
                                    bottomStart = 0.dp,
                                    bottomEnd = 0.dp
                                )
                            )
                            .background(Color.Transparent)

                            .padding(start = 9.dp, top = 15.dp, end = 360.dp, bottom = 13.dp)
                            .align(Alignment.CenterStart)
                            .alpha(1f)


                    ) {

                        Box(
                            modifier = Modifier
                                .width(59.dp)
                                .height(88.5.dp)
                                .clip(
                                    RoundedCornerShape(
                                        topStart = 0.dp,
                                        topEnd = 0.dp,
                                        bottomStart = 0.dp,
                                        bottomEnd = 0.dp
                                    )
                                )
                                .align(Alignment.Center)

                                .background(Color.Transparent)
                        )}
                }
            }
        }
    )
}