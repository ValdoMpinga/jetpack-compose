package com.example.jatpackcomposecourse

import StatelessCounter
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

@Composable
fun StatefulCounter(modifier: Modifier = Modifier) {
    var count by remember { mutableStateOf(0) }

    StatelessCounter(count, { count++ })
}