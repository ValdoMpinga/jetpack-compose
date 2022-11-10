package com.example.jatpackcomposecourse

import android.os.Bundle
import android.widget.EditText
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jatpackcomposecourse.ui.theme.JatpackComposeCourseTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContent {
            val scaffoldState = rememberScaffoldState()
            var textFieldState by remember {
                mutableStateOf("")
            }
            val scope = rememberCoroutineScope()

            //A Scaffold is a layout which implements the basic material design layout structure. You can add things like a TopBar, BottomBar, FAB or a Drawer.
            Scaffold(
                Modifier.fillMaxSize(),
                scaffoldState = scaffoldState
            ) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 30.dp)
                ) {
                    TextField(
                        value = textFieldState,
                        label = { "Enter your name please" },
                        onValueChange = { textFieldState = it },
                        singleLine = true,
                        modifier = Modifier.fillMaxWidth()
                    )

                    Spacer(modifier = Modifier.height(100.dp))

                    Button(onClick = {
                        scope.launch {
                            scaffoldState.snackbarHostState.showSnackbar("Hello Master $textFieldState")
                        }
                    }) {
                        Text("Call me master!")
                    }
                }
            }
        }
    }
}
