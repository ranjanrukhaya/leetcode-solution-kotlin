class Solution {
    fun findMinFibonacciNumbers(k: Int): Int {
        val arr = mutableListOf<Int>()
        if (k == 1) return 1
        var a = 1
        arr.add(a)
        var b = 1
        arr.add(b)
        while(true) {
            var sum = a + b
            if(sum > k) break
            arr.add(sum)
            a = b
            b = sum
        }
        var count = 0;
        var sum = k
        while(sum > 0) {
            val last = arr.findLast {it <= sum}
            last?.let {
                sum -= it
                count++;
            }
        }
        return count
    }
}