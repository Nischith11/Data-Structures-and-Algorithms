class Solution {
    public int missingNumber(int[] nums) {
        //Approach 1 = summation
        //Approach 2 = XOR Method
        int n=nums.length;
        int val=n*(n+1)/2;
        int summation=0;
        for(int i=0;i<nums.length;i++){
            summation+=nums[i];
        }
        return val - summation;
    }
}