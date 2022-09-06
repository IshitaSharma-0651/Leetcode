class Solution {
    public int trap(int[] height) {
        int size=height.length;
        int maxl[]=new int[size];
        int maxr[]=new int[size];
         maxl[0]=height[0];
        for(int i=1;i<height.length;i++)
        {
            maxl[i]=Math.max(maxl[i-1],height[i]);
        }
        maxr[size-1]=height[size-1];
        for(int i=size-2;i>=0;i--)
        {
            maxr[i]=Math.max(maxr[i+1],height[i]);
            
        }
        int water[]=new int[size];
        int sum=0;
        for(int i=0;i<size;i++)
        {
           water[i]=(Math.min(maxl[i],maxr[i]))-height[i];
           
        }
        for(int i=0;i<size;i++)
        {
          
            sum+=water[i];
        }
        return sum;   
        
    }
}