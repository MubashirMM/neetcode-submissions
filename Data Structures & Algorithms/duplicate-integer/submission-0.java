class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int val:nums){
            if(set.add(val)==false){
                return true;
            }
        }
        return false;
        
    }
}