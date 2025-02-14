package com.ascoding.composeoptimization

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ListItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

data class Robot(
    val id: Int,
    val name: String,
)

@Composable
fun LazyColumnPerformance(modifier: Modifier = Modifier) {
    var robots by remember {
        mutableStateOf(
            (1..50).map {
                Robot(
                    name = "Robot $it",
                    id = it
                )
            }
        )
    }
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
    ) {
        items(
            items = robots,
            key = { it.id }
        ) { item ->
            ListItem(
                headlineContent = {
                    Text(item.id.toString())
                },
                supportingContent = {
                    Text(item.name)
                },
                trailingContent = {
                    IconButton(
                        onClick = {
                            robots -= item
                        }
                    ) {
                        Icon(
                            imageVector = Icons.Default.Delete,
                            tint = Color.Blue,
                            contentDescription = "Delete"
                        )
                    }
                }
            )
        }
    }
}
