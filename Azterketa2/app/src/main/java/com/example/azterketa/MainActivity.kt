package com.example.azterketa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.azterketa.ui.theme.AzterketaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AzterketaTheme {
                Greeting()
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Greeting(
    /*modifier = Modifier
        .background(Color.Blue)*/
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)
            .padding(40.dp)
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Gray)
        ){
            Column(modifier = Modifier
                .weight(1f)
                .padding(40.dp)){
                Text(
                    text = "Hello Android!",
                    modifier = Modifier
                        .background(Color.Red)
                )
                Text(
                    text = "Hello Android!",
                    modifier = Modifier
                        .background(Color.Red)
                )
                Text(
                    text = "Hello Android!",
                    modifier = Modifier
                        .background(Color.Red)
                )
            }
            Column(modifier = Modifier
                .weight(1f)
                .padding(40.dp)){
                Text(
                    text = "Hello Android!",
                    modifier = Modifier
                        .background(Color.Red)
                )
            }
        }
        Row(
            modifier = Modifier
                .background(Color.White),
                //.fillMaxSize(),
            //contentAlignment = Alignment.Center
        ){
            Box(modifier = Modifier,
                //.padding(40.dp,0.dp),
                //.fillMaxSize(),
                contentAlignment = Alignment.Center
            ){
                Text(
                    text = "Hello Android!",
                    modifier = Modifier
                            .padding(40.dp)
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Green)
        ){
            Column(
                modifier = Modifier
                    .background(Color.Green)
                    .padding(5.dp,0.dp)){}
            Column(
                modifier = Modifier
                    .background(Color.Blue)
            ){
                Button(onClick = {},
                    modifier = Modifier
                        .size(60.dp)) {
                    Text(
                        text = "1",
                    )
                }
                Button(onClick = {},
                    modifier = Modifier
                        .size(60.dp)) {
                    Text(
                        text = "2",
                    )
                }
                Button(onClick = {},
                    modifier = Modifier
                        .size(60.dp)) {
                    Text(
                        text = "3",
                    )
                }
            }
            Column(
                modifier = Modifier
                    .background(Color.Green)
                    .padding(5.dp,0.dp)){}
            Column(
                modifier = Modifier
                    .background(Color.Red)
                    .padding(40.dp,0.dp)
            ){
                Button(onClick = {},
                    modifier = Modifier
                        .size(60.dp)) {
                    Text(
                        text = "4",
                    )
                }
                Button(onClick = {},
                    modifier = Modifier
                        .size(60.dp)) {
                    Text(
                        text = "5",
                    )
                }
                Button(onClick = {},
                    modifier = Modifier
                        .size(60.dp)) {
                    Text(
                        text = "6",
                    )
                }
            }
            Column(
                modifier = Modifier
                    .background(Color.Green)
                    .padding(5.dp,0.dp)){}
            Column(
                modifier = Modifier
                    .background(Color.Black)
            ){
                Button(onClick = {},
                    modifier = Modifier
                        .size(60.dp)) {
                    Text(
                        text = "7",
                    )
                }
                Button(onClick = {},
                    modifier = Modifier
                        .size(60.dp)) {
                    Text(
                        text = "8",
                    )
                }
                Button(onClick = {},
                    modifier = Modifier
                        .size(60.dp)) {
                    Text(
                        text = "9",
                    )
                }
            }
            Column(){
                //k
            }
        }
        Row(
            modifier = Modifier
                //.padding(12.dp)
                .fillMaxWidth()
                .background(Color.Yellow)
                //.weight(1f)
        ){
            Box(modifier = Modifier
                .fillMaxSize(),
                contentAlignment = Alignment.Center){
                Column(){
                    Text(
                        text = "Resultado",
                    )
                    Text(
                        text = "      666",
                    )
                }

            }
        }
    }
    /*Text(
        text = "Hello Android!",
        modifier = Modifier
    )*/
}