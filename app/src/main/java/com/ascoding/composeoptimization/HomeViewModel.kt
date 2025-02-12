package com.ascoding.composeoptimization

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

data class SomeState(
    val clicksCount: Int = 0
)

class HomeViewModel : ViewModel() {

    private val _state = MutableStateFlow(SomeState())
    val state = _state.asStateFlow()

    fun onCounterClick() {
        _state.update {
            it.copy(clicksCount = it.clicksCount + 1)
        }
    }
}
