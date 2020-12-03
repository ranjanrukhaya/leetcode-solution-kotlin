class Solution {
    fun fib(N: Int): Int {
        val arr = Array(N+1) {0}
        if(N == 0) {
            return 0
        }
        arr[1] = 1
        for (i in 2..N) {
            arr[i] = arr[i-1] + arr[i-2]
        }
        return arr[N]
    }
}