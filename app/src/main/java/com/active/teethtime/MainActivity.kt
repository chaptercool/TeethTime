package com.active.teethtime

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.Button
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.active.teethtime.ui.theme.AppTheme
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                HomeScreenPreview()
            }
        }
    }
}

@Composable
fun HomeScreen(modifier: Modifier = Modifier){
    Surface (color = MaterialTheme.colorScheme.primaryContainer){
        Column(
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(
                painter = painterResource(R.drawable.logo),
                contentDescription = "Logotype"
            )
            Spacer(modifier = Modifier.height(80.dp))
            Button(onClick = { /*TODO*/ }) {
                Text(stringResource(R.string.start))
            }
        }
        NavBar()
    }

}

@Composable
fun NavBar(modifier: Modifier = Modifier){
    Row(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalAlignment = Alignment.Bottom,
        horizontalArrangement = Arrangement.Absolute.Center


    ){
        FloatingActionButton(onClick = { /*TODO*/ }, containerColor = BottomAppBarDefaults.bottomAppBarFabColor) {
            Icon(painter = painterResource(R.drawable.calendar), contentDescription = "Calendar")
        }
        Spacer(modifier = Modifier.width(50.dp))
        FloatingActionButton(onClick = { /*TODO*/ }, containerColor = BottomAppBarDefaults.bottomAppBarFabColor) {
            Icon(painter = painterResource(R.drawable.help), contentDescription = "Help")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(modifier = Modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center)
    )
}