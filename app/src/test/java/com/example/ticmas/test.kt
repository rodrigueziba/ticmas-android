package com.example.ticmas

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MainViewModelTest {

    @get:Rule
    val rule = InstantTaskExecutorRule()

    private lateinit var viewModel: MainViewModel

    @Before
    fun setup() {
        viewModel = MainViewModel()
    }

    @Test
    fun testCompareTextos_WhenTextosAreEqual_ResultIsIguales() {
        // Arrange
        val textoModel = TextoModel("Hello", "Hello")

        // Act
        viewModel.compareTextos(textoModel)

        // Assert
        val result = viewModel.result.value
        assertEquals("Iguales", result)
    }

    @Test
    fun testCompareTextos_WhenTextosAreDifferent_ResultIsDiferentes() {
        // Arrange
        val textoModel = TextoModel("Hello", "World")

        // Act
        viewModel.compareTextos(textoModel)

        // Assert
        val result = viewModel.result.value
        assertEquals("Diferentes", result)
    }
}
