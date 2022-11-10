package com.example.jatpackcomposecourse

import android.os.Bundle
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jatpackcomposecourse.ui.theme.JatpackComposeCourseTheme

class MainActivity : ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumn {
                itemsIndexed(
                    listOf("This","is", "Jetpack", "Compose")
                ){
                    indexed, item->
                    Text(
                            "$indexed -> $item", fontSize = 20.sp,  fontWeight = FontWeight.Bold, textAlign = TextAlign.Center,modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 26.dp)
                        )

                }
//                    items(5000) {
//                        Text(
//                            "Item $it", fontSize = 20.sp,  fontWeight = FontWeight.Bold, textAlign = TextAlign.Center,modifier = Modifier
//                                .fillMaxWidth()
//                                .padding(vertical = 26.dp)
//                        )
//                    }


            }
        }
    }
}
