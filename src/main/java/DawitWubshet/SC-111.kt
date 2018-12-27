/*
Given start and end numbers, it returns a new array containing the
sequence of integers from start up to but not including end,
so start=5 and end=10 yields {5, 6, 7, 8, 9}.
The end number will be greater or equal to the start number.
 */

package DawitWubshet

class Sequence {
    fun generateIntegerSequence(start: Int, end: Int): IntArray {
        var arraySize = 0
        var sequenceStart = 0

        if (end > start) {
            arraySize = end - start
            var sequence = IntArray(arraySize)
            sequenceStart = start
            for (i in 0 until arraySize)
                sequence[i] = sequenceStart++

            return sequence
        }
        else
            return IntArray(arraySize)
    }
}