package com.ascoding.composeoptimization

import androidx.compose.runtime.Immutable

data class SomeState(
    val clicksCount: Int = 0,
    val testClass: TestClass = TestClass(0)
)

//@Immutable
data class TestClass(
    val i: Int
)