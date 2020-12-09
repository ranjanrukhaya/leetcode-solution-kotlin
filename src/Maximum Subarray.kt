class Solution {
    fun maxSubArray(nums: IntArray): Int {
        if(nums.isEmpty()) return 0
        var currentSum = nums[0]
        var maxSum = currentSum
        for(i in 1 until nums.size) {
            if(nums[i] > nums[i] + currentSum) {
                currentSum = nums[i]
            } else {
                currentSum += nums[i]
            }
            maxSum = Math.max(maxSum, currentSum)
        }

        return maxSum
    }
}