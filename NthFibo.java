class Solution {
    public int fib(int N) {
        if(N == 0 ) return 0;
        if(N == 2 || N == 1) return 1;
        
        int a = 0, b = 1, c = 0;
        for(int i = 0; i < N - 1; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
