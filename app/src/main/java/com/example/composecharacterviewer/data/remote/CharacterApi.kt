package com.example.composecharacterviewer.data.remote

import com.example.composecharacterviewer.data.model.CharacterResult
import retrofit2.http.GET

interface CharacterApi {

    @GET("simpsons")
    suspend fun fetchCharacterData(): CharacterResult
}