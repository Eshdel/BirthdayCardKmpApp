package com.example.project

import App
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Preview(name = "Light Theme")
@Composable
fun AndroidPreview(){
    App(false)
}

@Preview(name = "Dark Theme")
@Composable
fun AndroidAppPreview(){
    App(true)
}