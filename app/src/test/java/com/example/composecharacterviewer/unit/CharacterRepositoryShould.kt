package com.example.composecharacterviewer.unit

import com.example.composecharacterviewer.data.model.CharacterResult
import com.example.composecharacterviewer.data.remote.CharacterService
import com.example.composecharacterviewer.data.repository.CharacterRepository
import com.example.composecharacterviewer.util.BaseUnitTest
import com.nhaarman.mockitokotlin2.whenever
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.times
import org.mockito.Mockito.verify

class CharacterRepositoryShould: BaseUnitTest() {

    private val service: CharacterService = mock()
    private val characterResponse = mock<CharacterResult>()
    private val exception = RuntimeException("Something went wrong")

    @Test
    fun `get Character Response From Service`() = runTest {
        val repository = CharacterRepository(service)

        repository.getCharacterData()

        verify(service, times(1)).fetchCharacterData()
    }

    @Test
    fun `emit Character Data From Service`() = runTest {
        val repository = mockSuccessfulResponse()

        assertEquals(characterResponse, repository.getCharacterData().first().getOrNull())
    }

    private suspend fun mockSuccessfulResponse(): CharacterRepository {
        whenever(service.fetchCharacterData()).thenReturn(
            flow {
                emit(Result.success(characterResponse))
            }
        )
        return CharacterRepository(service)
    }
}