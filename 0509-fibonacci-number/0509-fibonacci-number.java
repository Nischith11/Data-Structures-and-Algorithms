class Solution {
    public int fib(int n) {
        //without using recursion
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        int a=0;
        int b=1;
        int count=1;
        while(true){
            int c=a+b;
            count++;
            if(count == n){
                return c;
            }
            int temp=b;
            a=b;b=c;
        }
    }
}