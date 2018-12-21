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




