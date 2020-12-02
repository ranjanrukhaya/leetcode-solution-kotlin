class Solution {
    fun runningSum(nums: IntArray): IntArray {
        val output = IntArray(nums.size) {0}
        output[0] = nums[0]
        for( i in 1 until nums.size) {
            output[i] = output[i-1] + nums[i]
        }
        return output
    }
}