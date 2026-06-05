class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int cursum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i = 0; i< nums.length; i++){
            cursum += nums[i];

            if(i>= k-1){
                maxsum = Math.max(cursum, maxsum);
                cursum -= nums[i-k+1];
            }
        }
        return (double)maxsum/k;
    }
}