class Solution {
    public int maxProfit(int[] prices) {
        int minp= Integer.MAX_VALUE;
        int maxp = 0, profit = 0;
        for(int x: prices){
            if(x < minp) minp = x;

            profit = x-minp;

            if(profit > maxp)
                maxp = profit;
        }
       
        return maxp;
    }
}