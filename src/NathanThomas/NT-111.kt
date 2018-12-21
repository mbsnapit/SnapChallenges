/*
Given start and end numbers, return a new array containing
the sequence of integers from start up to but not including
end, so start=5 and end=10 yields {5, 6, 7, 8, 9}. The end
number will be greater or equal to the start number. Note
that a length-0 array is valid.

Examples:
fizzArray3(5, 10) → [5, 6, 7, 8, 9]
fizzArray3(11, 18) → [11, 12, 13, 14, 15, 16, 17]
fizzArray3(1, 3) → [1, 2]
*/


package NathanThomas

fun main(args: Array<String>) {

    // Input from user.
    print("Enter the first number: ")
    val inputOne = readLine()!!
    var firstNum: Int = inputOne.toInt()
    println()

    print("Enter the last number: ")
    val inputTwo = readLine()!!
    var lastNum: Int = inputTwo.toInt()
    var endNum = lastNum - 1
    println()

    // Magician's declaration.
    println("To the amazement of all present in the auditorium, ")
    println("I will print out $firstNum all the way to $endNum!!")
    println("*crowd gasps*")
    println()
    println("Hit ENTER when you are ready.")
    println("If you're sure you won't . . .")
    println("GO INSANE!!!")
    readLine()
    println()

    fizz(firstNum, lastNum)
}

fun fizz(firstNum: Int, lastNum: Int) {
    var nums = IntArray((lastNum - firstNum))
    var counter = firstNum

    for (i in 0 until nums.size) {
        nums[i] = counter++
    }
    for (i in 0 until nums.size) {
        print(nums[i])
        print(" ")

    }
    println()
}




