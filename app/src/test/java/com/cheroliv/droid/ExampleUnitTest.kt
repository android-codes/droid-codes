package com.cheroliv.droid

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun concat_isCorrect() {
        val expected = dataList
            .toString()
            //pour supprimer le premier et dernier caractère,
            // afin de valider l'egalité du test unitaire
            .drop(1)//suprimer les n premier caracteres de la chaine
            .dropLast(1)//suprimer les n derniers caracteres de la chaine
        val result = concat(dataList)
        assertEquals(expected, result)
    }
}