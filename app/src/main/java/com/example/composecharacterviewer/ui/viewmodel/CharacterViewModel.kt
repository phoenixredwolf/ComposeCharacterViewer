package com.example.composecharacterviewer.ui.viewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import com.example.composecharacterviewer.data.model.CharacterResult
import com.example.composecharacterviewer.data.repository.CharacterRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject
import javax.xml.transform.Result

@HiltViewModel
class CharacterViewModel @Inject constructor(
    private val repo: CharacterRepository
) {

    suspend fun getCharacterData() {
        repo.getCharacterData()
    }
}