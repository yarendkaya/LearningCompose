package com.yarendemirkaya.rowscolumnsandbasicsizing

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yarendemirkaya.rowscolumnsandbasicsizing.ui.theme.RowsColumnsAndBasicSizingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Column is a layout composable that arranges its child composables vertically in a top-to-bottom order.
        //Row is a layout composable that arranges its child composables horizontally, in a left-to-right order.
        //Modifier is used to describe how composables are styled, configured, positioned, and interacted with.
        //Vertical arrangement and horizontal alignment is used to align the items in the column
        //Vertical alignment and horizontal alignment is used to align the items in the row
        //Weight Usage Purpose: Distributes available space among child composables based on their relative weights.
        //The weight determines how much space a composable should occupy relative to its siblings.
        //fillMaxSize:It is a layout modifier that makes a composable expand to fill all the available space in its parent container.
        setContent {
            Column(
                modifier = Modifier,
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            )
            {
                Row(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                        .background(Color.Blue),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically

                ) {
                    Text("Hello ")
                    Text("World")
                }
                Row(
                    modifier = Modifier
                        .weight(1f)
                        .fillMaxSize()
                        .background(Color.Green),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text("Yaren")
                    Text("Demirkaya")
                }
            }
        }
    }
}