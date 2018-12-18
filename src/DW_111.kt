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