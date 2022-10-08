class Solution {
    Map<Character,Character>map=new HashMap<>();
       
    public boolean isValid(String s) {
       map.put(']','[');
        map.put(')','(');
        map.put('}','{');
      /*  Stack <Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(map.containsValue(c))//to ensure that it is a opening bracket
                st.push(c);
            else
            {
                if(st.isEmpty() || st.pop()!=map.get(c))
                    return false;
                
            }
        }
        return st.isEmpty();
        */
        int top=-1;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(map.containsValue(c))
                top=i;
            else
            {
                if(top==-1 || map.get(c)!=s.charAt(top))
                    return false;
                else 
                    top=getTop(s,top-1);
            }
        }
        return top==-1;
    }
    public int getTop(String s, int index)
    {
       int right=0;
        while(index>=0)
        {
            char ch=s.charAt(index);
            if(map.containsValue(ch))
                right--;
            else 
                right++;
            if(right<0)
                return index;
            index--;
        }
        return -1;
    }
}