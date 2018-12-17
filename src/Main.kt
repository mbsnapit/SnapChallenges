fun main (args: Array<String>) {

    // SC_110 demo
    val occurrence = Occurrence()
    println("8 occurs ${occurrence.count(8, 8, 0)} times in 8")
    println("8 occurs ${(occurrence.count(818, 8, 0))} times in 818")
    println("8 occurs ${(occurrence.count(8818, 8, 0))} times in 8818")
}