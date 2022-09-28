class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        fun(0,nums, ans, new ArrayList<>());
        return ans;
        
    }
    public void fun(int index,int nums[],List<List<Integer>> ans,List<Integer> ds)
    {
        ans.add(new ArrayList<>(ds));
        for(int i=index;i<nums.length;i++)
        {
            ds.add(nums[i]);
            fun(i+1,nums,ans,ds);
            ds.remove(ds.size()-1);
            
        }
    }
}