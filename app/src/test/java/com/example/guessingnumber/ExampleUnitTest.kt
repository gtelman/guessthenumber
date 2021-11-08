package com.example.guessingnumber

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.*
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner
import java.util.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */


@RunWith(MockitoJUnitRunner::class)
class ExampleUnitTest {

    @Mock
    private lateinit var guessTheNumber: MainActivity

    @Before
    fun createCheckAnswer() {
        MockitoAnnotations.openMocks(guessTheNumber)
    }

    @Test
    fun checkIfRandomNumberIsValid() {
        `when`(guessTheNumber.createRandomNumber()).thenReturn(getRandomNumber())

        assertEquals(9, getRandomNumber())
        assertNotNull(guessTheNumber.createRandomNumber())
    }
/*
    @Test
    fun checkCorrectTheNumber() {
    }

    @Test
    fun shouldFailOnNotANumber() {
    }

    @Test
    fun shouldFailOnEmptyField() {
    }
 */
}