package com.example.composecharacterviewer.data.repository

import com.example.composecharacterviewer.data.model.CharacterResult
import com.example.composecharacterviewer.data.remote.CharacterService
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CharacterRepository @Inject constructor(
    private val service: CharacterService
) {
    suspend fun getCharacterData() : Flow<Result<CharacterResult>> =
        service.fetchCharacterData()
}
