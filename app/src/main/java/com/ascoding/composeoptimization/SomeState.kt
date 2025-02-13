package com.ascoding.composeoptimization

data class SomeState(
    val clicksCount: Int = 0,
    val testClass: TestClass = TestClass(0)
)

data class TestClass(
    val i: Int
)