package com.example.myjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Row(modifier = Modifier
                .background(Color.Gray)
                .fillMaxWidth().fillMaxHeight(0.5f)) {
                Column(
                    modifier = Modifier.background(Color.Blue).fillMaxHeight().fillMaxWidth(0.5f),
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Hello")
                    Text(text = "Misha")
                    Text(text = "Jon")
                }
                Column(
                    Modifier.background(Color.Green).fillMaxSize(),
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "Hello")
                    Text(text = "Misha")
                    Text(text = "Jon")
                }
            }
        }
    }
}
//setContent {
//    Column (modifier =  Modifier.background(Color.Green).fillMaxSize(),
//        verticalArrangement = Arrangement.SpaceBetween,
//        horizontalAlignment = Alignment.End
//    ){
//        Text(text = "Hello")
//        Text(text = "Misha")
//        Text(text = "Jon")
//    }
//setContent {
//    Row (modifier =  Modifier.background(Color.Green).fillMaxSize(),
//        horizontalArrangement = Arrangement.SpaceBetween,
//        verticalAlignment = Alignment.Bottom
//    ){
//        Text(text = "Hello")
//        Text(text = "Misha")
//        Text(text = "Jon")
//    }


//setContent {
//    Row(modifier = Modifier
//        .background(Color.Gray)
//        .fillMaxSize(),
//        horizontalArrangement = Arrangement.SpaceEvenly) {
//        Column(
//            modifier = Modifier.background(Color.Blue),
//            verticalArrangement = Arrangement.SpaceBetween,
//            horizontalAlignment = Alignment.End
//        ) {
//            Text(text = "Hello")
//            Text(text = "Misha")
//            Text(text = "Jon")
//        }
//        Column(
//            Modifier.background(Color.Green),
//            verticalArrangement = Arrangement.SpaceBetween,
//            horizontalAlignment = Alignment.End
//        ) {
//            Text(text = "Hello")
//            Text(text = "Misha")
//            Text(text = "Jon")
//        }
//    }
//}


//setContent {
//    Row(modifier = Modifier
//        .background(Color.Gray)
//        .fillMaxWidth().fillMaxHeight(0.5f),
//        horizontalArrangement = Arrangement.SpaceEvenly) {
//        Column(
//            modifier = Modifier.background(Color.Blue),
//            verticalArrangement = Arrangement.SpaceBetween,
//            horizontalAlignment = Alignment.End
//        ) {
//            Text(text = "Hello")
//            Text(text = "Misha")
//            Text(text = "Jon")
//        }
//        Column(
//            Modifier.background(Color.Green).fillMaxHeight(0.5f),
//            verticalArrangement = Arrangement.SpaceBetween,
//            horizontalAlignment = Alignment.End
//        ) {
//            Text(text = "Hello")
//            Text(text = "Misha")
//            Text(text = "Jon")
//        }
//    }
//}