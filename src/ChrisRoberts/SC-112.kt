package ChrisRoberts

/**
 * The classic word-count algorithm: given an array of strings, return a Map<String></String>, Integer> with a
 * key for each different string, with the value the number of times that string appears in the array.
 * wordCount(["a", "b", "a", "c", "b"]) → {"b": 2, "c": 1, "a": 2}
 * wordCount(["c", "b", "a"]) → {"b": 1, "c": 1, "a": 1}
 * wordCount(["c", "c", "c", "c"]) → {"c": 4}
 */
fun main(args: Array<String>) { //This is an inline comment
   val list = listOf("a", "b", "a", "c", "b")
    println(list.groupingBy { it }.eachCount().filter { it.value > 0 })
    val listb = listOf("c", "b", "a")
    println(listb.groupingBy { it }.eachCount().filter { it.value > 0 })
    val listc = listOf("c", "c", "c", "c")
    println(listc.groupingBy { it }.eachCount().filter { it.value > 0 })

    }
