package com.ascoding.composeoptimization

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.unit.dp

@Composable
fun ListScreen(modifier: Modifier = Modifier) {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
    ) {
        for (i in 1..50) {
            ListItem(
                alpha = scrollState.value / 50f,
                modifier = modifier.fillMaxWidth()
            )
        }
    }
}

@Composable
fun ListItem(
    alpha: Float,
    modifier: Modifier = Modifier
) {
    Text(
        text = "List item",
        modifier = modifier
            .padding(32.dp)
            .alpha(alpha)
    )
}
