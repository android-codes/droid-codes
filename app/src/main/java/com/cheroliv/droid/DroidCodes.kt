package com.cheroliv.droid

class DroidCodes

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

fun main(
    @Suppress("UNUSED_PARAMETER")
    args: Array<String>
) {
    println("Hello World Android Basics")
    println("PI: $PI")
    println(dataList)
    println(concat(dataList))
}

fun concat(
    texts: List<String>,
    separator: String = SEPARATOR
): String = texts.joinToString(separator)

