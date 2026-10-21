class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength=1;
        int l=0;
        int r=1;
        
        if(s.length()==0) return 0;
        HashSet<Character> set=new HashSet<>();
        set.add(s.charAt(l));
        while(r<s.length()){
            if(!set.add(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }else{
                set.add(s.charAt(r));
                maxLength=Math.max(maxLength,r-l+1);
                r++;
            }
        }
      
        return maxLength;
    }
}
