class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if(n <= 1){
            return;
        }
        k = k % n;
        int[] temp=new int[k];
        int ni=0;
        for(int i=n-k;i<n;i++){
            temp[ni++]=nums[i];
        }
        for(int j=n-k-1;j>=0;j--){
            nums[j+k]=nums[j];
        }
        for(int s=0;s<k;s++){
            nums[s]=temp[s];
        }
    }
}