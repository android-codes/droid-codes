package education.cccp.droid.codes

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
const val PI = 3.1415
const val SEPARATOR = ", "

val dataList: List<String> = listOf(
    "Android",
    "Kotlin",
    "Java",
    "Javascript",
    "Typescript",
    "Groovy",
    "Go",
    "Swift",
    "iOS"
)

fun concat(
    texts: List<String>,
    separator: String = SEPARATOR
): String = texts.joinToString(separator)


class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun somePrinties() {
        println("Hello World Android Basics")
        println("PI: $PI")
        println(dataList)
        println(concat(dataList))
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