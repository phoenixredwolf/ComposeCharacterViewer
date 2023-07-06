package com.example.composecharacterviewer.unit

import com.example.composecharacterviewer.data.model.CharacterResult
import com.example.composecharacterviewer.data.repository.CharacterRepository
import com.example.composecharacterviewer.ui.viewmodel.CharacterViewModel
import com.example.composecharacterviewer.util.BaseUnitTest
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.times
import com.nhaarman.mockitokotlin2.verify
import kotlinx.coroutines.test.runTest
import org.junit.Test

class CharacterViemodelShould: BaseUnitTest() {

    private val repo = mock<CharacterRepository>()
    private val characterRepsonse = mock<CharacterResult>()
    private val exception = RuntimeException("Something went wrong")

    @Test
    fun `get Character Response from Repository`() = runTest {
        val viewmodel = CharacterViewModel(repo)

        viewmodel.getCharacterData()

        verify(repo, times(1)).getCharacterData()
    }
}