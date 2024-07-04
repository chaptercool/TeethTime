package com.active.teethtime

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import com.active.teethtime.ui.theme.AppTheme
import com.active.teethtime.ui.theme.AppTheme

class CalendarActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                CalendarPreview()
            }
        }
    }
}


@Composable
fun Calendar(modifier: Modifier = Modifier){
    val context = LocalContext.current
    Surface (color = MaterialTheme.colorScheme.primaryContainer){
        Column (
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            var calendarCount = Text(text = "45", fontSize = 100.sp, style = MaterialTheme.typography.displayLarge)
            Text(text = "days", fontSize = 20.sp)
        }
        Row(
            modifier = Modifier
                .padding(50.dp)
                .fillMaxSize()
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.Absolute.Left
        ){

            val intent = Intent(context, MainActivity::class.java)
            FloatingActionButton(onClick = { context.startActivity(intent) }) {
                Icon(painter = painterResource(R.drawable.back), contentDescription = "Calendar")

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CalendarPreview(){
    Calendar(modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center)
    )

}