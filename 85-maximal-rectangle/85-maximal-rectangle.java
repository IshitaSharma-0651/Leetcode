class Solution {
    public int maximalRectangle(char[][] matrix) {
        int arr[]=new int[matrix[0].length];
        for(int j=0;j<matrix[0].length;j++)
        {
            
              arr[j]=matrix[0][j]-'0';
             
        }
         int mx=MAH(arr);
            for(int i=1;i<matrix.length;i++)
            {
                for(int j=0;j<matrix[0].length;j++)
                {
                    if(matrix[i][j]=='0')
                        arr[j]=0;
                    else
                        arr[j]+=matrix[i][j]-'0';
                }
            
        mx=Math.max(mx,MAH(arr));
            }
        return mx;
        
    }
    
    public int MAH(int[] heights) {
        int ans=0;
        int ps[]=previousSmall(heights);
        int ns[]=nextSmall(heights);
        for(int i=0 ;i<heights.length ;i++){
            ans=Math.max(ans,(ns[i]-ps[i]-1)*heights[i]);
        }
        return ans;
    }
    public int[] previousSmall(int[] arr) {
        int n=arr.length;
        Stack<Integer> s= new Stack<>();
        int[] ans=new int[n];
        for(int i=0 ;i<n ;i++){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]) s.pop();
            if(s.isEmpty()) ans[i]=-1;
            else ans[i]=s.peek();
            
            s.push(i);
        }
        return ans;
        
    }
    public int[] nextSmall(int[] arr) {
        int n=arr.length;
        Stack<Integer> s= new Stack<>();
        int[] ans=new int[n];
        for(int i=n-1 ;i>=0 ;i--){
            while(!s.isEmpty() && arr[s.peek()]>=arr[i]) s.pop();
            if(s.isEmpty()) ans[i]=n;
            else ans[i]=s.peek();
            
            s.push(i);
        }
        return ans;
        
    }
}
