class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s1 = new Stack<>();
        int n = temperatures.length;
        int[] answer = new int[n];
        
        for(int i = n - 1; i >= 0; i--) {
		
			while(!s1.isEmpty() && temperatures[i] >= temperatures[s1.peek()]) {
                s1.pop();
            }
			
			if(!s1.isEmpty()) {
                answer[i] = s1.peek() - i;
            }
			
			s1.push(i);
        }
        
        return answer;
        
        
    }
}