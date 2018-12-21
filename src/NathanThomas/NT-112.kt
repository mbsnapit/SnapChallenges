/*
The classic word-count algorithm: given an array of strings,
return a Map<String, Integer> with a key for each different
string, with the value the number of times that string
appears in the array.

Examples:
wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
wordCount(["c", "c", "c", "c"]) → {"c": 4}
*/
package NathanThomas

fun main(args: Array<String>) {
    val text = "a, b, c, d, e, d, C, s, c,C ,f"
    val r = Regex("""\p{javaLowerCase}+""")
    val match = r.findAll(text)
    val wordGroups = match.map { it.value }
        .groupBy { it }
        .map { Pair(it.key, it.value.size) }
    for ((letter, freq) in wordGroups) {
        println("$letter: $freq")
    }
}