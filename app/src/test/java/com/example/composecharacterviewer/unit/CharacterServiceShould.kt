package com.example.composecharacterviewer.unit

import com.example.composecharacterviewer.data.model.CharacterResult
import com.example.composecharacterviewer.data.remote.CharacterApi
import com.example.composecharacterviewer.data.remote.CharacterService
import com.example.composecharacterviewer.util.BaseUnitTest
import com.nhaarman.mockitokotlin2.whenever
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.times
import org.mockito.Mockito.verify

class CharacterServiceShould: BaseUnitTest() {

    private val characterApi: CharacterApi = mock()
    private lateinit var service: CharacterService
    private val characterResponse: CharacterResult = mock()

    @Test
    fun `fetch character result from api`() = runTest {
        service = CharacterService(characterApi)

        service.fetchCharacterData().first()

        verify(characterApi, times(1)).fetchCharacterData()
    }

    @Test
    fun `convert Values To Flow Result And Emit Them`() = runTest {
        whenever(characterApi.fetchCharacterData()).thenReturn(characterResponse)

        service = CharacterService(characterApi)

        assertEquals(Result.success(characterResponse), service.fetchCharacterData().first())
    }

    @Test
    fun `emits Error Result When Network Fails`() = runTest {
        whenever(characterApi.fetchCharacterData())
            .thenThrow(RuntimeException("Damn backend developers"))

        service = CharacterService(characterApi)

        assertEquals("Something went wrong",
            service.fetchCharacterData().first().exceptionOrNull()?.message
        )
    }

}