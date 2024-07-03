package com.active.teethtime

import androidx.compose.foundation.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.active.teethtime.ui.theme.AppTheme

class TimerActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                Timer()
            }
        }
    }
}

@Composable
fun Timer(modifier: Modifier = Modifier){
    Surface (color = MaterialTheme.colorScheme.primaryContainer){
        Column(
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            val ExampleProgress = 50
            CircularProgressIndicator(progress = { ExampleProgress.toFloat() }, modifier.size(230.dp))

        }
        ImageDisplay()
        TimeRow()
        Row(
            modifier = Modifier
                .padding(30.dp)
                .fillMaxSize()
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.Absolute.Left
        ){
            ExtendedFloatingActionButton(
                onClick = { /* todo*/ },
                icon = { Icon(painter = painterResource(R.drawable.back), contentDescription = "Back") },
                text = { Text(text = "Cancel") },
            )

        }
    }


}

@Composable
fun TimeRow(modifier: Modifier = Modifier){
    Row(
        modifier = Modifier
            .padding(top = 300.dp)
            .fillMaxSize()
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ){

        val Seconds = Text(text = "16", fontSize = 30.sp)
        Text(text = " s", fontSize = 18.sp, color = Color.Gray)
    }
}

@Composable
fun ImageDisplay(modifier: Modifier = Modifier){
    Column (
        modifier = modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
       val img = Image(
            painterResource(R.drawable.test), contentDescription = "Test", Modifier.size(120.dp)
       )
    }
}

@Preview(showBackground = true)
@Composable
fun TimerPreview() {
    Timer(modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center)
    )
}