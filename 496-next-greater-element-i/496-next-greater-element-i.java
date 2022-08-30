class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        Stack<Integer> stack=new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();
         for(int i=(nums2.length)-1;i>=0;i--)
         {
             if(stack.size()==0)
                map.put(nums2[i],-1);
             else if(stack.size()>0 && stack.peek()>nums2[i])
                 map.put(nums2[i],stack.peek());
             else if(stack.size()>0 && stack.peek()<nums2[i])
             {
                 while(stack.size()>0 && stack.peek()<nums2[i])
                     stack.pop();
                 if(stack.size()==0)
                     map.put(nums2[i],-1);
                 else
                     map.put(nums2[i],stack.peek());
                     
             }
             
             stack.push(nums2[i]);
             
         }
                 for(int i=0;i<nums1.length;i++)
                 {
                     arr[i]=map.get(nums1[i]); 
                 }
        return arr;
}
}