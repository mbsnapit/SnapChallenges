class Occurrence {
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