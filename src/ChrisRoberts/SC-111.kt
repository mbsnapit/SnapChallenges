package ChrisRoberts

//
//Given start and end numbers, return a new array containing the sequence of integers from start up to but not including end, so start=5 and end=10 yields {5, 6, 7, 8, 9}. The end number will be greater or equal to the start number. Note that a length-0 array is valid.
//
//Examples:
//fizzArray3(5, 10) → [5, 6, 7, 8, 9]
//fizzArray3(11, 18) → [11, 12, 13, 14, 15, 16, 17]
//fizzArray3(1, 3) → [1, 2]
//

fun main(args: Array<String>) { //This is an inline comment
    var a: Int = 5
    var b: Int = 10
    var c: Int = b - a
    var callerResult = Array<Int>(c) { 0 }
    callerResult = fizzArraay3(a, b)
    println("Parameters passed: $a, $b")
    var element: Int = 0
    for (e in callerResult) {
        print(" Array [$element] = $e, ")
        element++
    }
    a = 11
    b = 18
    println("")
    callerResult = fizzArraay3(a, b)
    println("Parameters passed: $a, $b")
    for (e in callerResult) {
        print(" Array [$element] = $e, ")
        element++
    }
    a = 1
    b = 3
    println("")
    callerResult = fizzArraay3(a, b)
    println("Parameters passed: $a, $b")
    for (e in callerResult) {
        print(" Array [$element] = $e, ")
        element++
    }
}

fun fizzArraay3(start: Int, end: Int): Array<Int> {
    var n: Int = end - start;
    var newStart = start
    var result = Array<Int>(n) { 0 }
    for (i in 0..n - 1) {
        result[i] = newStart++
    }
    return result
}
