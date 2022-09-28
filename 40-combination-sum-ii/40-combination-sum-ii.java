class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        fcomb(0,candidates,target,ans,new ArrayList<>());
        return ans;
        
    }
    private void fcomb(int index,int arr[],int target,List<List<Integer>>ans, List<Integer> ds)
    {
        if(target==0)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=index;i<arr.length;i++)
        {
            if(arr[i]>target)
                break;
            if(i>index && arr[i]==arr[i-1])
                continue;
            
            ds.add(arr[i]);
            fcomb(i+1,arr,target-arr[i],ans,ds);
            ds.remove(ds.size()-1);
        }
    }
}