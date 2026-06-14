class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
       int a = mat.length;
       int b = mat[0].length;
       int[][] res = new int[r][c]; 
       if(r*c != a*b) return mat;

       for(int i = 0; i< r*c; i++)
           res[i/c][i%c] = mat[i/b][i%b];

        return res; 
    }
}