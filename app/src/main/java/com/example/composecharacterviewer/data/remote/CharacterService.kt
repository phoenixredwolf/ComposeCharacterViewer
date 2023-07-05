package com.example.composecharacterviewer.data.remote

import com.example.composecharacterviewer.data.model.CharacterResult
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class CharacterService @Inject constructor(
    private val characterApi: CharacterApi
) {
    suspend fun fetchCharacterData() : Flow<Result<CharacterResult>> {
        return flow {
            emit(Result.success(characterApi.fetchCharacterData()))
        }.catch {
            emit(Result.failure(RuntimeException("Something went wrong")))
        }
    }
}
