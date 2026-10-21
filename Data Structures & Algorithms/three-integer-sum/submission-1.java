class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            {
                int v1=nums[i];
                int l=i+1;
                int r=nums.length-1;
                while(l<r){
                    int sum=v1+nums[l]+nums[r];
                    if(sum==0){
                        List<Integer> li=new ArrayList<>();
                        while(l<r && nums[l]==nums[l+1]){
                            l++;
                        }
                        while(l<r && nums[r]==nums[r-1]){
                            r--;
                        }
                        li.add(v1);
                        li.add(nums[l]);
                        li.add(nums[r]);
                        res.add(li);
                        l++;
                        r--;

                    }else if(sum<0){
                        l++;
                    }else{
                        r--;
                    }
                }
            }
        }return res;
    }
}
