class Solution {
    public int maxSubArray(int[] nums) {
        int maxs = Integer.MIN_VALUE;
        int currsum = 0;

        for(int i = 0; i<nums.length; i++){
            currsum = Math.max(nums[i], currsum + nums[i]);
            maxs = Math.max(maxs, currsum);
        }

        return maxs;
    }
}