class Solution {
    public int maxSubArray(int[] array) {
        //Brute force approach 
        //generate all the subarrays and calculate the sum of each subarray
        //and finally return the maximum sum
        
        //Optimal solution
        //Kadane's Algorithm
        int maxi=Integer.MIN_VALUE;
        long sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
            maxi=(int)Math.max(maxi,sum);
            if(sum < 0){
                sum=0;
            }
        }
        return maxi;
    }
}