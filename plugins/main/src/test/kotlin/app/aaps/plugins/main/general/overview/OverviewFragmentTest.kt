package app.aaps.plugins.main.general.overview

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class OverviewFragmentTest {

    @Test
    fun createSentence() {
        val overviewFragment = OverviewFragment()
        val sentence = overviewFragment.createSentence()
        assertEquals("Hello World", sentence)

    }

}