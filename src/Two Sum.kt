class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = hashMapOf<Int, Int>()
        for(i in 0..nums.size) {
            val remaining = target - nums[i]
            if(map.containsKey(remaining)) {
                return intArrayOf(map.get(remaining)!!, i)
            }
            map.put(nums[i], i)
        }
        return intArrayOf()
    }
}