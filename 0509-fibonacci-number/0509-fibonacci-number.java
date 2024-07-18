class Solution {
    public int fib(int n) {
        //without using recursion
        // if(n == 0){
        //     return 0;
        // }
        // if(n == 1){
        //     return 1;
        // }
        // int a=0;
        // int b=1;
        // int count=1;
        // while(true){
        //     int c=a+b;
        //     count++;
        //     if(count == n){
        //         return c;
        //     }
        //     int temp=b;
        //     a=b;b=c;
        // }
       return  nthFibo(n);
    }
      //solution 2 --> using recursion
      //create a method that will calculate the nth fibonacci number
    public int nthFibo(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return nthFibo(n-1) + nthFibo(n-2);
    }
}