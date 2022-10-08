class Solution {
    Map<Character,Character>map=new HashMap<>();
       
    public boolean isValid(String s) {
       map.put(']','[');
        map.put(')','(');
        map.put('}','{');
        Stack <Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(map.containsValue(c))
                st.push(c);
            else
            {
                if(st.isEmpty() || st.pop()!=map.get(c))
                    return false;
                
            }
        }
        return st.isEmpty();
    }
}