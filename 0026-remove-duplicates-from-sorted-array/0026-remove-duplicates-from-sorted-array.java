class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int count=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j] > nums[i]){
                int temp=nums[i+1];
                nums[i+1]=nums[j];
                nums[j]=temp;
                i++;
                count++;
            }

        }
        return count+1;
    }
}