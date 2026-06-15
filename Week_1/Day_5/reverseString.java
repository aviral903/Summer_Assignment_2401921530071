class Solution {
    public void reverseString(char[] s) {
        int a=0, b= s.length-1;
        while(a<b){
            char x = s[a];
            s[a] = s[b];
            s[b]=x;
            a++;
            b--;
        }
    }
}