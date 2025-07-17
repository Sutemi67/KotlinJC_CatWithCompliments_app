package com.example.kotik.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun CatImage(imageId: Int, onClick: () -> Unit) {
    Image(
        painter = painterResource(id = imageId),
        contentDescription = "kotik",
        modifier = Modifier
            .clickable { onClick() }
            .padding(bottom = 150.dp)
    )
}