package com.example.guessingnumber

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Rule
import com.example.guessingnumber.MainActivity as MainActivity

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class MainActivityInstrumentedTest {

    @get:Rule
    var activityScenarioRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun sendButtonOnClick() {
        onView(withId(R.id.send_button)).perform(click())
    }

    @Test
    fun checkNumberInputFilled() {
        onView(withId(R.id.edit_text_number)).perform(click(), typeTextIntoFocusedView("5"))
    }
}