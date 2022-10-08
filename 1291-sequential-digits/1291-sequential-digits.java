class Solution {
    List<Integer> ans=new ArrayList<>();
    public List<Integer> sequentialDigits(int low, int high) {
        for(int i=1;i<9;i++)
        {
            formdig(low,high,i,0);
            
        }
        Collections.sort(ans);
            return ans;
    }
        public void formdig(int low,int high,int i,int num )
        {
            if(num>=low && num <=high)
                ans.add(num);
            if(num>high || i>9)
                return;
            formdig(low,high,i+1,num*10+i);
        }
        
    
}