package ChrisRoberts

/**
Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit, except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4. Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
Examples:
ChrisRoberts.count8(8) → 1
ChrisRoberts.count8(818) → 2
ChrisRoberts.count8(8818) → 4
 */
fun main(args: Array<String>) { //This is an inline comment
    var result = 0
    var n = 8
    result = count8(n)
    println("The ChrisRoberts.count8 function passing $n resulted in $result")
    n = 818
    result = count8(n)
    println("The ChrisRoberts.count8 function passing $n resulted in $result")
    n = 8818
    result = count8(n)
    println("The ChrisRoberts.count8 function passing $n resulted in $result")
    n = 8088
    result = count8(n)
    println("The ChrisRoberts.count8 function passing $n resulted in $result")
    n = 123
    result = count8(n)
    println("The ChrisRoberts.count8 function passing $n resulted in $result")
    n = 81238
    result = count8(n)
    println("The ChrisRoberts.count8 function passing $n resulted in $result")
    n = 88788
    result = count8(n)
    println("The ChrisRoberts.count8 function passing $n resulted in $result")
    n = 8234
    result = count8(n)
    println("The ChrisRoberts.count8 function passing $n resulted in $result")
    n = 2348
    result = count8(n)
    println("The ChrisRoberts.count8 function passing $n resulted in $result")
    n = 23884
    result = count8(n)
    println("The ChrisRoberts.count8 function passing $n resulted in $result")
   n = 0
    result = count8(n)
    println("The ChrisRoberts.count8 function passing $n resulted in $result")
    n = 1818188
    result = count8(n)
    println("The ChrisRoberts.count8 function passing $n resulted in $result")
    n = 8818181
    result = count8(n)
    println("The ChrisRoberts.count8 function passing $n resulted in $result")
    n = 1080
    result = count8(n)
    println("The ChrisRoberts.count8 function passing $n resulted in $result")
    n = 188
    result = count8(n)
    println("The ChrisRoberts.count8 function passing $n resulted in $result")
    n = 88888
    result = count8(n)
    println("The ChrisRoberts.count8 function passing $n resulted in $result")
    n = 9898
    result = count8(n)
    println("The ChrisRoberts.count8 function passing $n resulted in $result")
    n = 78
    result = count8(n)
    println("The ChrisRoberts.count8 function passing $n resulted in $result")
}

fun count8(n: Int, prevWas8: Boolean = false): Int {
    var num8s: Int = 0;
       if (n == 0) // base case
        return 0
    if (n % 10 == 8) //we found an 8!
        num8s++
    if (prevWas8 && num8s > 0) // we found two 8's in a row!
        num8s++
    return num8s + count8(n / 10, num8s > 0)
}
