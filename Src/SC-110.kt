/**
Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit, except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4. Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

Examples:
count8(8) → 1
count8(818) → 2
count8(8818) → 4

 */
fun main(args: Array<String>) { //This is an inline comment
    var result = 0

    var n = 8
    result = count8(n)
    println("The count8 function passing $n resulted in $result")

    n = 818
    result = count8(n)
    println("The count8 function passing $n resulted in $result")

    n = 8818
    result = count8(n)
    println("The count8 function passing $n resulted in $result")

    n = 8088
    result = count8(n)
    println("The count8 function passing $n resulted in $result")

    n = 123
    result = count8(n)
    println("The count8 function passing $n resulted in $result")

    n = 81238
    result = count8(n)
    println("The count8 function passing $n resulted in $result")

    n = 88788
    result = count8(n)
    println("The count8 function passing $n resulted in $result")

    n = 8234
    result = count8(n)
    println("The count8 function passing $n resulted in $result")

    n = 2348
    result = count8(n)
    println("The count8 function passing $n resulted in $result")

    n = 23884
    result = count8(n)
    println("The count8 function passing $n resulted in $result")

    n = 0
    result = count8(n)
    println("The count8 function passing $n resulted in $result")

    n = 1818188
    result = count8(n)
    println("The count8 function passing $n resulted in $result")

    n = 8818181
    result = count8(n)
    println("The count8 function passing $n resulted in $result")

    n = 1080
    result = count8(n)
    println("The count8 function passing $n resulted in $result")

    n = 188
    result = count8(n)
    println("The count8 function passing $n resulted in $result")

    n = 88888
    result = count8(n)
    println("The count8 function passing $n resulted in $result")

    n = 9898
    result = count8(n)
    println("The count8 function passing $n resulted in $result")

    n = 78
    result = count8(n)
    println("The count8 function passing $n resulted in $result")
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

//    var n = n
//    var cd = 0
//    var pd = 0
//    var c = 0  // cd for current digit, pd for previous digit,c=count
//
//    if (n == 0)
//    // base condition
//        return 0
//
////    cd = n % 10       // finding the rightmost digit
//
//    if (n % 10 == 8) {
//        if (n / 10 % 10 == 8)
//            return 2 + count8(n / 10)
//    }
//    return count8(n / 10)
//
//    // if rightmost digit id 8 then
//    {
//        c++
//
//        n = n / 10// moving towards left from rightmost digit
//
//        if (n != 0)
//            pd = n % 10//second rightmost digit(similarly as secondlast digit)
//
//        if (cd == 8 && pd == 8)
//        // if rightmost and second rightmost equals 8, double c
//            c = c * 2
//    } else
//    // if cd not equals 8 then
//        c = 0
//
//    return c + count8(n / 10)//adding count and recursively calling method
