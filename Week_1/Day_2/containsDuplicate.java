class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> lol = new HashSet<>();
        for(int i: nums){
            if(lol.contains(i)) return true;
            lol.add(i);
        }
        return false;
    }
}