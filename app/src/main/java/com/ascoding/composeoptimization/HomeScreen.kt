package com.ascoding.composeoptimization

import androidx.collection.IntList
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import kotlinx.collections.immutable.ImmutableList
import kotlinx.collections.immutable.persistentListOf
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collectLatest

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = viewModel()
) {
//    var clicksCount by remember {
//        mutableIntStateOf(0)
//    }
//    LaunchedEffect(clicksCount) {
//        viewModel.state.collectLatest {
//            clicksCount = it.clicksCount
//        }
//    }
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

            TestFunction(persistentListOf())
        }
    }
}

@Composable
fun TestFunction(value: ImmutableList<Int>) {
    Text("test")
    println("xyz HomeScreen.kt -> TestFunction ${value}")
}
