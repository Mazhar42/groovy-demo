class Fibonacci {
    static void main(String[] args){
        Map<Integer,Long> memory = [1:1,2:1];
        def num=40;

        println fib(num, memory);
        // println memory.values();
        // println memory.keySet();
        // println memory.size();
        // memory.put(22,2444);
        // memory.put(12,24544);
        // memory.put(29,2457444);
        // memory.put(26,243463463444);
        // memory.put(22,99999999999992444);
        // println memory;
    }

    static int fib(int n, Map<Integer, Long> memory){
        if(memory.get(n) != null) return memory.get(n);
        
        if(n<=2) return 1;

        def nthfib = fib(n-1,memory)+fib(n-2,memory);
        memory.put(n,nthfib);
        return nthfib;
    }
}