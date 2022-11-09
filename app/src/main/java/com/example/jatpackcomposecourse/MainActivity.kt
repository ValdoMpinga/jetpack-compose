package com.example.jatpackcomposecourse

import android.os.Bundle
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jatpackcomposecourse.ui.theme.JatpackComposeCourseTheme

class MainActivity : ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier
                .background(Color.Green)
                .fillMaxHeight(0.5f)
                .fillMaxWidth()
                .border(5.dp,Color.Yellow)
                .padding(5.dp)
                .border(5.dp,Color.LightGray)
                .padding(5.dp)
                .border(8.dp,Color.Red)
                .padding(115.dp)
      //          .requiredWidth(300.dp)
            )
            {
                Text("Hello", modifier =Modifier.clickable {  })
                Spacer(modifier = Modifier.height(50.dp))
                Text("World")
            }
        }
    }
}
