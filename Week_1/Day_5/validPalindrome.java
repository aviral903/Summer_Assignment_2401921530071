class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0) return true; 
        StringBuilder x = new StringBuilder();
        for(char ch: s.toCharArray()){
            if(Character.isLetterOrDigit(ch)) x.append(Character.toLowerCase(ch));
        }
        String f = x.toString();
        String r = x.reverse().toString();
        return f.equals(r);
    }
}
    