package baekjoon.문자열

// 문제 링크 : https://www.acmicpc.net/problem/1181

fun main() = with(System.`in`.bufferedReader()) {
    val wordCount = readLine()!!.toInt()
    val words = mutableSetOf<String>()

    repeat(wordCount) {
        words.add(readLine())
    }

    printSortedWords(words)
}

private fun printSortedWords(words : Set<String>) {
    val sortedWords = words.sortedWith(compareBy({ it.length }, { it }))
    sortedWords.forEach { word ->
        println(word)
    }
}
