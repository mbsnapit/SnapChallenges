/*
Given a non-negative int n, compute recursively (no loops)
the count of the occurrences of 8 as a digit, except that
an 8 with another 8 immediately to its left counts double,
so 8818 yields 4. Note that mod (%) by 10 yields the rightmost
digit (126 % 10 is 6), while divide (/) by 10 removes the
rightmost digit (126 / 10 is 12).

Examples:
count8(8) → 1
count8(818) → 2
count8(8818) → 4
*/

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
