class Solution {
    public void nextPermutation(int[] nums) {
        int breakpoint=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                breakpoint=i;
                break;
            }
        }
        if(breakpoint == -1){
            Arrays.sort(nums);
        }else{
         for(int i=nums.length-1;i>breakpoint;i--){
                if(nums[i] > nums[breakpoint]){
                    swap(nums,breakpoint,i);
                    break;
                }
        }
        Arrays.sort(nums,breakpoint+1,nums.length);
        }
    }

    public static void swap(int[] nums,int p1,int p2){
        int temp=nums[p1];
        nums[p1]=nums[p2];
        nums[p2]=temp;
    }
}