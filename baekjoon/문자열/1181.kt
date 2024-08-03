package baekjoon.문자열

// 문제 링크 : https://www.acmicpc.net/problem/1181

fun main() = with(System.`in`.bufferedReader()) {
    val wordCount = readLine()!!.toInt()
    val words = mutableSetOf<String>()

    repeat(wordCount) {
        words.add(readLine())
    }

    output(sortWords(words))
}

private fun sortWords(words : Set<String>): List<String> {
    return words.sortedWith(compareBy({ it.length }, { it }))
}

private fun output(words: List<String>) {
    words.forEach { word ->
        println(word)
    }
}
