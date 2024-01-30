package com.example.project1

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project1.ui.theme.Project1Theme

@Composable
fun Organization() {
    Project1Theme {
        Surface (
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ){

            Column(
                modifier = Modifier.padding(horizontal = 20.dp)
            ) {
                Spacer(modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.05f))

                Row {
                    Column {
                        Text(
                            text = "HELLO!",
                            fontSize = 50.sp,
                            color = Color(138, 109, 219, 221)
                        )
                        Text(
                            text ="YOUR NAME",
                            fontSize = 50.sp,
                            color = Color(0,0,0)
                        )
                    }
                    Image(
                        painter = painterResource(id = R.drawable.ellipse9),
                        contentDescription = "Image of individual",
                        alignment = Alignment.Center,
                        modifier = Modifier.size(80.dp,120.dp)
                    )
                }
                Spacer(modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.03f))
                Text(
                    text ="BROWSE ORGANIZATIONS",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier =
                Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.02f)
                )
                Boxes()
                Spacer(modifier =
                Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.02f)
                )

                var raised:Int=33000
                var goal:Int =50000

                Column {
                    ProgressBar(raised,goal)
                    Row (){
                        Text(text = "$ $raised raised", fontWeight = FontWeight.Bold)
                        Spacer(modifier = Modifier.fillMaxWidth(0.55f))
                        Text(text = "$ $goal goal", fontWeight = FontWeight.Bold)
                    }
                }

                Spacer(modifier = Modifier.fillMaxWidth()
                    .fillMaxHeight(0.06f)
                )

                Boxes()
                Spacer(modifier =
                Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.1f)
                )
                raised=89890
                goal=100000
                Column {
                    ProgressBar(raised,goal)
                    Row (
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        Text(text = "$ $raised raised", fontWeight = FontWeight.Bold)
                        Spacer(modifier = Modifier.fillMaxWidth(0.5f))
                        Text(text = "$ $goal goal", fontWeight = FontWeight.Bold)
                    }
                }

            }
        }
    }
}


@Preview
@Composable
fun Display(){
    Project1Theme {
        Surface (
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ){

            Column(
                modifier = Modifier.padding(horizontal = 20.dp)
            ) {
                Spacer(modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.05f))

                Row {
                    Column {
                        Text(
                            text = "HELLO!",
                            fontSize = 50.sp,
                            color = Color(138, 109, 219, 221)
                        )
                        Text(
                            text ="YOUR NAME",
                            fontSize = 50.sp,
                            color = Color(0,0,0)
                        )
                    }
                    Image(
                        painter = painterResource(id = R.drawable.ellipse9),
                        contentDescription = "Image of individual",
                        alignment = Alignment.Center,
                        modifier = Modifier.size(80.dp,120.dp)
                    )
                }
                Spacer(modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.03f))
                Text(
                    text ="BROWSE ORGANIZATIONS",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold
                )
                Spacer(modifier =
                Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.02f)
                )
                Boxes()
                Spacer(modifier =
                Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.02f)
                )

                var raised:Int=33000
                var goal:Int =50000

                Column {
                    ProgressBar(raised,goal)
                    Row (){
                        Text(text = "$ $raised raised", fontWeight = FontWeight.Bold)
                        Spacer(modifier = Modifier.fillMaxWidth(0.55f))
                        Text(text = "$ $goal goal", fontWeight = FontWeight.Bold)
                    }
                }

                Spacer(modifier = Modifier.fillMaxWidth()
                    .fillMaxHeight(0.06f)
                )

                Boxes()
                Spacer(modifier =
                    Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.1f)
                )
                raised=89890
                goal=100000
                Column {
                    ProgressBar(raised,goal)
                    Row (
                        horizontalArrangement = Arrangement.SpaceBetween
                    ){
                        Text(text = "$ $raised raised", fontWeight = FontWeight.Bold)
                        Spacer(modifier = Modifier.fillMaxWidth(0.5f))
                        Text(text = "$ $goal goal", fontWeight = FontWeight.Bold)
                    }
                }

            }
        }
    }
}

@Composable
fun Boxes(){
    Box(
        modifier = Modifier
            .background(
                Color(224, 219, 219, 255),
                shape = RoundedCornerShape(30.dp)
            )
            .fillMaxWidth()
            .height(180.dp)
    ) {
    }
}

@Composable
fun ProgressBar(raised: Int,goal: Int){
    val filled :Float =(raised.toFloat()/goal)
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(20.dp)
            .background(
                Color(224, 219, 219, 255),
                shape = RoundedCornerShape(10.dp)
            )
    ){
        Box(
            modifier = Modifier
                .fillMaxWidth(filled)
                .height(20.dp)
                .background(
                    color = Color(159, 140, 213, 221),
                    shape = RoundedCornerShape(10.dp)
                )
        )
    }
}