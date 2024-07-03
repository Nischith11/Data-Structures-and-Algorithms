class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int pointer=0;
        int count=0;
        int maxconsecutive=Integer.MIN_VALUE;
        while(pointer < nums.length){
            if(nums[pointer] == 1){
                count++;
            }
            if(count > maxconsecutive){
                maxconsecutive=count;
            }
            if(nums[pointer]!=1){
                count=0;
            }
            pointer++;
        }
        return maxconsecutive;
    }
}