class Solution {
    public void moveZeroes(int[] nums) {
        int pointer1=0;
        int pointer2=0;
        while(pointer2<nums.length) {//edge case 1 = first element Might be 0
            if (nums[pointer2] != 0) {//edge case 2 = first element Might not be 0
                int temp = nums[pointer1];
                nums[pointer1] = nums[pointer2];
                nums[pointer2] = temp;
                pointer1++;
            }
            pointer2++;
        }
    }
}