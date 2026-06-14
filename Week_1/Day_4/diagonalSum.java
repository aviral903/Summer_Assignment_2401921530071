class Solution {
    public int diagonalSum(int[][] mat) {
        int x = 0;
        int n = mat.length;
        for(int i = 0; i< n; i++){
            x += mat[i][i];
            x += mat[n-1-i][i];
        }
        return n%2==0 ? x : x-mat[n/2][n/2];
    }
}