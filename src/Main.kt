fun main (args: Array<String>) {
    val occurrence = Occurrence()
    val sequence = Sequence()
    var generatedSequence = IntArray(0)

    // Task SC_110 demo
    println("8 occurs ${occurrence.count(8, 8, 0)} times in 8")
    println("8 occurs ${(occurrence.count(818, 8, 0))} times in 818")
    println("8 occurs ${(occurrence.count(8818, 8, 0))} times in 8818")

    // Task SC_111 demo
    generatedSequence = sequence.generateIntegerSequence(5, 20)
    print("The sequence is ${generatedSequence[0]}")
    for (i in 1 until generatedSequence.size)
        print(" , ${generatedSequence[i]}")
}