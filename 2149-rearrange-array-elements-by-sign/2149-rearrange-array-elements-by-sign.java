class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] ans=new int[nums.length];
        int positive=0;
        int negative=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0){
                ans[positive]=nums[i];
                positive+=2;
            }else{
                ans[negative]=nums[i];
                negative+=2;
            }
        }
        return ans;
        
        //what if this was the case 
        //same problem but
        //Number of positives != Number of negatives 
        //Then thier is only one solution
        //Take 2 ArrayList
        //One is for +ve's and the other one is for -ve's
        //if this was the case then 
        //If no's of +ve's < than the No's of -ve's
        //first fill array alternatively till the point
        //fill remaining -ve's at the end 
        //vice-versa
    }
}