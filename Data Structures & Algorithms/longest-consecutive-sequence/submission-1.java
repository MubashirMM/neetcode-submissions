class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int max=Integer.MIN_VALUE;
        int current=0;
        for(int val:nums){
            if(!set.contains(val-1)){
                int currNum=val;
                current=1;
                while(set.contains(currNum+1)){
                    currNum+=1;
                    current+=1;
                }
            }
           max=Math.max(max,current);
        }
        return max;
    }
}
