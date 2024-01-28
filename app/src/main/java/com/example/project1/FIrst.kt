package com.example.project1

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun First () {
    bground()

    Column(
        modifier = Modifier.padding(horizontal = 20.dp)
    ) {
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.20f)
        )

        Text(
            text = "Login",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(20.dp))

        textFields(lbl = "email")
        Spacer(modifier = Modifier.height(20.dp))
        textFields(lbl = "password")

        Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent,
                contentColor = Color.Black
            ),
            modifier = Modifier.align(Alignment.End)
        ) {
            Text(
                text = "forgot password?",
                fontWeight = FontWeight.Bold
            )
        }
        Spacer(modifier = Modifier.height(30.dp))

        DividerWithText(text = "or")

        Spacer(modifier = Modifier.height(30.dp))

        butnS(lbl = "Continue With Google", src = R.drawable.dada)
        Spacer(modifier = Modifier.height(20.dp))
        butnS("Continue With Apple", R.drawable.apple)
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun textFields(lbl :String){
    //val state = remember {
    //   mutableStateOf("")

    TextField(
        value = "" ,
        onValueChange = {
//            state.value = it
        },
        label = { Text(text = lbl)},
        modifier = Modifier
            .fillMaxWidth()
            .border(2.dp, color = Color.Black, shape = RoundedCornerShape(10.dp))
    )
}

@Composable
fun butnS(lbl: String,src: Int){
    Button(onClick = {  },
        shape = RoundedCornerShape(8.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.colorScheme.background,
            contentColor = Color.Black
        ),
        modifier = Modifier
            .fillMaxWidth()
            .border(2.dp, color = Color.Black, shape = RoundedCornerShape(10.dp))
    ) {
        Row(
            modifier = Modifier.padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Icon(
                painter = painterResource(id = src),
                contentDescription = "Icon",
                modifier = Modifier.size(24.dp),
                tint = Color.Unspecified
            )
            Spacer(modifier = Modifier.width(8.dp)) // Adjust the spacing between icon and text
            Text(text = lbl, color = Color.Black)
        }
    }
}

@Composable
fun bground(){
    Box (modifier = Modifier.fillMaxSize()){
        Image(
            painter = painterResource(id = R.drawable.bg),
            contentDescription = "bg image",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.matchParentSize()
        )
    }
}

@Composable
fun DividerWithText(text: String){
    Row(verticalAlignment = Alignment.CenterVertically) {
        Divider(
            modifier = Modifier
                .weight(1f)
                .padding(end = 8.dp),
            color = Color.Black,
            thickness = 1.dp
        )
        Text(
            text = text,
            color = Color.Black,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )
        Divider(
            modifier = Modifier
                .weight(1f)
                .padding(start = 8.dp),
            color = Color.Black,
            thickness = 1.dp
        )
    }
}