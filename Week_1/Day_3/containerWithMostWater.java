class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int area=0, max=0;
            int l=0, r=n-1;
          while(l<r) {
             int w= Math.min(height[l],height[r]);
             area = w * (r-l);

             max=Math.max(max,area);
             if(height[l]< height[r]) l++;
             else if(height[r] <= height[l]) r--;
            } 
        return max;
    }
}