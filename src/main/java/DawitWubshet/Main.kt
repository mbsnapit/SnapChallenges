package DawitWubshet
import DawitWubshet.HtmlParserChallenge

fun main (args: Array<String>) {
    val occurrence = Occurrence()
    val sequence = Sequence()
    val word = Word()
    var htmlParser = HtmlParserChallenge()
    var generatedSequence = IntArray(0)
    var mapCount: MutableMap<String, Int>
    var strings: Array<String>

    // Task SC-110 demo
    println("\nSC-110 Result:")
    // Test with input: 8
    println("8 occurs ${occurrence.count(8, 8, 0)} times in 8")
    // Test with input: 818
    println("8 occurs ${(occurrence.count(818, 8, 0))} times in 818")
    // Test with input: 8818
    println("8 occurs ${(occurrence.count(8818, 8, 0))} times in 8818")

    // Task SC-111 demo
    println("\nSC-111 Result:")
    // Test with input: [5, 20)
    generatedSequence = sequence.generateIntegerSequence(5, 20)
    print("The integer sequence in [5, 20) is ${generatedSequence[0]}")
    for (i in 1 until generatedSequence.size)
        print(" , ${generatedSequence[i]}")
    // Test with input: [11, 18)
    generatedSequence = sequence.generateIntegerSequence(11, 18)
    print("\nThe integer sequence in [5, 20) is ${generatedSequence[0]}")
    for (i in 1 until generatedSequence.size)
        print(" , ${generatedSequence[i]}")
    // Test with input: [1, 2)
    generatedSequence = sequence.generateIntegerSequence(1, 2)
    print("\nThe integer sequence in [5, 20) is ${generatedSequence[0]}")
    for (i in 1 until generatedSequence.size)
        print(" , ${generatedSequence[i]}")

    // Task SC-112 demo
    println("\n\nSC-112 Result:")
    // Test with input: ["a", "b", "a", "c", "b"]
    strings = arrayOf("a", "b", "a", "c", "b")
    mapCount = word.wordCount(strings)
    println("Input: [\"a\", \"b\", \"a\", \"c\", \"b\"]\tOutput:$mapCount")
    // Test with input: ["c", "b", "a"]
    strings = arrayOf("c", "b", "a")
    mapCount = word.wordCount(strings)
    println("Input: [\"c\", \"b\", \"a\"]\tOutput:$mapCount")
    // Test with input: ["c", "c", "c", "c"]
    strings = arrayOf("c", "c", "c", "c")
    mapCount = word.wordCount(strings)
    println("Input: [\"c\", \"c\", \"c\", \"c\"]\tOutput:$mapCount")

    // Task SC-113 demo
    println("\n\nSC-113 Result:")
    println("\n${htmlParser.extractScriptTags("https://www.w3schools.com/")}")
    // Demo of the comprehensive version of the extractScriptTags method
    println("\n${htmlParser.extractTags("https://www.w3schools.com/", "script")}")
}