package NathanThomas

fun main(args: Array<String>) {

    print("Enter any number: ")
    val input = readLine()!!
    val number: Int = input.toInt()

    findEight(number, 0)
}

fun findEight(numbers: Int, previous: Int): Int {

    var numbers = numbers
    var current = 0
    var count = 0

    if (numbers == 0)
        return 0
    current = numbers % 10

    if (current == 8 && previous == 8) {
        count += 2
    } else
        if (current == 8) {
            count++
        }

    numbers /= 10

    count += findEight(numbers, current)

    println("Compare next - Total: $count current: $current previous: $previous number: $numbers")
    println("")
    return count
}


