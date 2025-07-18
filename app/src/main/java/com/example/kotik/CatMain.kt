package com.example.kotik

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.kotik.ui.ScreenUi
import kotlin.random.Random

@Composable
fun CatMain() {

    var textRandomCount by rememberSaveable { mutableStateOf(1) }
    var isFirstPage by rememberSaveable { mutableStateOf(true) }

    val screenData = when (isFirstPage) {
        true -> Triple(R.drawable.kotik1, "", true)
        false -> Triple(R.drawable.kotik2, getCompliment(textRandomCount), false)
    }

    ScreenUi(screenData) {
        isFirstPage = !isFirstPage
        textRandomCount = Random.nextInt(1, 102)
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Preview() {
    CatMain()
}