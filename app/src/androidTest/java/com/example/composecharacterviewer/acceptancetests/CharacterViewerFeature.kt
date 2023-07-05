package com.example.composecharacterviewer.acceptancetests

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import com.example.composecharacterviewer.MainActivity
import org.junit.Rule
import org.junit.Test

class CharacterViewerFeature {

    @get:Rule
    val composeTestRule = createAndroidComposeRule(MainActivity::class.java)

    @Test
    fun displayCharacterTitle() {
        composeTestRule
            .onNodeWithText("The Simpsons characters")
            .assertIsDisplayed()
    }


}