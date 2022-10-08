class Solution {
    public int longestValidParentheses(String s) {
       /* Stack<Integer> st=new Stack<>();
        st.push(-1);
        int max=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(')
                st.push(i);
            else
            {
               
                st.pop();
            if(st.isEmpty())
                st.push(i);
            else
            {
                int len=i-st.peek();
                max=Math.max(len,max);
            }
             
            }
            
        }
        return max;
        */
        int open=0,close=0,max=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(')
                open++;
            else 
                close++;
            if(open==close)
            {
                int len=open+close;
                max=Math.max(len,max);
                
            }
            else if(open < close)
                open=close=0;
             
        }
        open=close=0;
           for(int i=s.length()-1;i>=0;i--)
        {
            char c=s.charAt(i);
            if(c=='(')
                open++;
            else 
                close++;
            if(open==close)
            {
                int len=open+close;
                max=Math.max(len,max);
                
            }
            else if(open > close)
                open=close=0;
             
        }
        return max;
        
    }
}