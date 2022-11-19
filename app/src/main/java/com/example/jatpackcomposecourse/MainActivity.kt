package com.example.jatpackcomposecourse

import android.os.Bundle
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jatpackcomposecourse.ui.theme.JatpackComposeCourseTheme

class MainActivity : ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContent {
            var sizeState by remember { mutableStateOf(200.dp) }
            val size by animateDpAsState(
                targetValue = sizeState,
//                tween(
//                    durationMillis = 3000,
//                    delayMillis =300,
//                    easing = LinearOutSlowInEasing
//                )
//            spring(
//                Spring.DampingRatioMediumBouncy
//            ),
                keyframes{
                    durationMillis = 5000
                    sizeState at 0 with LinearEasing
                    sizeState * 1.5f at 1000 with FastOutLinearInEasing
                    sizeState * 2f at 5000
                }
            )

            Box(
                modifier = Modifier
                    .size(size)
                    .background(Color.Red),
                contentAlignment = Alignment.Center
            )
            {
                Button(onClick = {sizeState += 50.dp}) {
                    Text(text = "Increase size")
                }
            }


        }
    }
}

@Composable
fun CircularProgressBar(
    percentage: Float,
    number: Int,
    fontSize: TextUnit = 28.sp,
    radius: Dp = 50.dp,
    color: Color = Color.Green
)
{

}
