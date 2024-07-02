class Solution {
    public void rotate(int[] nums, int k) {
        if(k >= nums.length){
            int cal=k % nums.length;
            k=cal;
        }
        ReverseKElements(nums,k);
        ReverseNMinusK(nums,k);
        ReverseWhole(nums,k);
    }
    public static void ReverseKElements(int[] nums,int k){
        int p1=nums.length - k;
        int p2=nums.length-1;
        while(p1 < p2){
            int temp=nums[p1];
            nums[p1]=nums[p2];
            nums[p2]=temp;
            p1++;
            p2--;
        }
        
    }
    
    public static void ReverseNMinusK(int[] nums,int k){
        int p1=0;
        int p2=(nums.length-k) - 1;
        while(p1 < p2){
            int temp=nums[p1];
            nums[p1]=nums[p2];
            nums[p2]=temp;
            p1++;
            p2--;
        }
    }
    
    public static void ReverseWhole(int[] nums,int k){
        int p1=0;
        int p2=nums.length-1;
        while(p1 < p2){
            int temp=nums[p1];
            nums[p1]=nums[p2];
            nums[p2]=temp;
            p1++;
            p2--;
        }
    }
}