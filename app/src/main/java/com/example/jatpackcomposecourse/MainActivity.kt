package com.example.jatpackcomposecourse

import android.os.Bundle
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jatpackcomposecourse.ui.theme.JatpackComposeCourseTheme

class MainActivity : ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContent {
            Row(modifier = Modifier
                .width(600.dp)
                .fillMaxHeight()
                .background(Color.Blue),
                horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically) {
                Text(text = "James")
                Text(text = "Guevara")
                Text(text = "James")
                Text(text = "Guevara")
            }

//            Column(modifier = Modifier
//                .fillMaxSize()
//                .background(Color.Green),
//                horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.SpaceBetween)
//
//            {
//                Text(text = "James")
//                Text(text = "Guevara")
//                Text(text = "James")
//                Text(text = "Guevara")
//            }

        }
    }
}

