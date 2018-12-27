/*
The classic word-count algorithm: given an array of strings, it
returns a Map<String, Integer> with a key for each different string,
with the value the number of times that string appears in the array.
 */

package DawitWubshet

class Word {
    fun wordCount(strings: Array<String>): MutableMap<String, Int> {
        val mapCount: MutableMap<String, Int> = mutableMapOf()
        for (element in strings) {
            if (mapCount.containsKey(element))
                mapCount.set(element, (mapCount.getValue(element) + 1))
            else
                mapCount.put(element, 1)
        }

        return mapCount
    }
}