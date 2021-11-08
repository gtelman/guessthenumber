package com.example.guessingnumber

import android.content.ContentValues.TAG
import android.os.Handler
import android.os.Looper
import android.os.Parcel
import android.util.Log
import androidx.test.core.app.ActivityScenario
import androidx.test.core.app.launchActivity
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.hamcrest.Matchers.not

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import com.example.guessingnumber.MainActivity as MainActivity

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
/*
    private lateinit var guessTheNumber: MainActivity

    @Before
    fun createCheckAnswer() {
        guessTheNumber = MainActivity()
    }
*/
    @get:Rule var activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun test() {
          activityScenarioRule.scenario.onActivity{
              onView(withId(R.id.send_button)).perform(click())
          }

    }
}