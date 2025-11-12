package app.aaps.plugins.main.general.overview

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class OverviewFragmentTest {

    @Test
    fun createSentence() {
        val wp = WordPlay()
        val sentence = wp.createSentence()
        assertTrue(sentence.toString().split(" ").size > 5)
    }

}