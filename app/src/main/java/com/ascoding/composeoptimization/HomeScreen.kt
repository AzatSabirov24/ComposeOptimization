package com.ascoding.composeoptimization

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = viewModel()
) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column {
            val state = viewModel.state.collectAsState().value
            println("xyz HomeScreen.kt -> state.clicksCount -> ${state.clicksCount}")

            Text(
                text = "Click ${state.clicksCount}",
                fontSize = 20.sp,
                modifier = modifier.clickable(onClick = viewModel::onCounterClick)
            )

            TestFunction(state.testClass)
        }
    }
}

@Composable
fun TestFunction(value: TestClass) {
    Text("test")
    println("xyz HomeScreen.kt -> TestFunction ${value.i}")
}
