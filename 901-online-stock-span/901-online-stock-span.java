class StockSpanner {
    Stack<int[]> s1;
    

    public StockSpanner() {
        s1=new Stack<>();
       
        
    }
    
    public int next(int price) {
        int time=1;
        while(!s1.isEmpty() && s1.peek()[0] <= price)
        {
            time+=s1.pop()[1];
        }
        s1.add(new int []{price,time});
        return time;
    }
            
        
    }

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */