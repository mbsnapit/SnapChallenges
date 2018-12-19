/*
Given a non-negative int n, compute recursively (no loops) the count
of the occurrences of 8 as a digit, except that an 8 with another 8
immediately to its left counts double, so 8818 yields 4.
 */

package DawitWubshet

class Occurrence {
    private var count = 0
    // the count of the occurrences of searchKey as a digit,
    // except that a searchKey followed by one counts as double
    fun count(input: Int, searchKey: Int, previousDigit: Int): Int {
        var count = 0
        var currentNumber = 0

        if (input > 0) {
            currentNumber = getRightMost(input)
            if (currentNumber == searchKey) {
                if (previousDigit == currentNumber)
                    count += 2
                else
                    count++
            }

            count += count (removeRightMost(input), searchKey, currentNumber)
        }

        return count
    }

    private fun getRightMost(input: Int): Int {
        return (input % 10)
    }

    private fun removeRightMost(input: Int): Int {
        return (input / 10)
    }
}