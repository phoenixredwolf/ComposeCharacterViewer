package com.example.composecharacterviewer.ui

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.composecharacterviewer.utility.mockCharacterResponse

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CharacterViewer() {
    val characterResult = mockCharacterResponse

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text( text = characterResult.heading ) }
            )
        }
    ) {

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
    CharacterViewer()
}