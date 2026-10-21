class Solution {
    List<List<Integer>> res=new ArrayList<>();
    void dfs(int[] nums,int i ,List<Integer> curr){
        if(i>=nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[i]);
        dfs(nums,i+1,curr);
        curr.remove(curr.size()-1);
        dfs(nums,i+1,curr);
       
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> curr=new ArrayList<>();
        dfs(nums,0,curr);
        return res;
    }
}
