class Solution {
    public int[] twoSum(int[] arr, int target) {
        int[] ansarray=new int[2];
        boolean ans=false;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum=0;
            sum+=arr[i];
            for (int j = i+1; j < arr.length; j++) {
                sum+=arr[j];
                if(sum == target){
                    ansarray[0]=i;
                    ansarray[1]=j;
                    break;
                }else{
                    sum-=arr[j];
                }
            }
        }
        return ansarray;
    }
}