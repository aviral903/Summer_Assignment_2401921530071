class Solution {
    public int[] sortedSquares(int[] nums) {
        int a=0, b= nums.length-1;
        int[] res = new int[nums.length];
        int j=b;
        while(a<=b){
            int sqa = (int)Math.pow(nums[a],2);
            int sqb = (int)Math.pow(nums[b],2);
            if(sqa >= sqb){
            res[j]=sqa;
            a++;
            }
            else{
            res[j]=sqb;
            b--;
            }
            j--;
        }

        return res;
    }
}