class Solution { // 4 pointers
    public List<Integer> spiralOrder(int[][] arr) {
        ArrayList<Integer> noob = new ArrayList<>();
        int a=arr.length, b=arr[0].length;
        int fr=0, lr=a-1, fc=0, lc=b-1;
        while(fr<=lr && fc<=lc) {
            for(int j=fc; j<=lc;j++)
            noob.add(arr[fr][j]);
            fr++;
            if(fr>lr || fc>lc) break;

            for(int i=fr; i<=lr; i++)
            noob.add(arr[i][lc]);
            lc--;
            if(fr>lr || fc>lc) break;
            
            for(int j=lc; j>=fc; j--)
            noob.add(arr[lr][j]);
            lr--;
            if(fr>lr || fc>lc) break;

            for(int i=lr; i>=fr; i--)
            noob.add(arr[i][fc]);
            fc++;
        }
        return noob;
    }
}