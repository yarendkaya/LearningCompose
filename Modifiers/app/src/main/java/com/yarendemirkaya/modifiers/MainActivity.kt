package com.yarendemirkaya.modifiers

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yarendemirkaya.modifiers.ui.theme.ModifiersTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .background(Color.Green)
                    .fillMaxHeight()
                    .fillMaxWidth()
                    //.width(600.dp)// allows the parent layout to override it if necessary.
                    //.requiredWidth(8000.dp) // we can force it to be as wide as we specify
                    .border(5.dp, Color.Red)
                    .padding(10.dp)
                    .border(5.dp, Color.Blue)
                    .padding(10.dp)
                    .border(10.dp, Color.Yellow)
                    .padding(10.dp)

            ) {
                Text(
                    "Hello", modifier = Modifier
                        .border(5.dp, Color.Magenta)
                        .padding(5.dp)
                        .offset(20.dp, 20.dp)
                        .border(10.dp, Color.Black)
                        .padding(10.dp)
                )

                Spacer(modifier = Modifier.height(50.dp))
                Text("World",modifier = Modifier.clickable {

                })
            }
        }
    }
}



