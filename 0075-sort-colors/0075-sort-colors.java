class Solution {
    public void sortColors(int[] arr) {
        //brute force approach
//         int color1=0;
//         int color2=0;
//         int color3=0;
//         int n=arr.length;
//         int[] temp=new int[n];
//         for (int i = 0; i < arr.length; i++) {
//             if(arr[i]==0){
//                 color1++;
//             }
//             else if(arr[i] == 1){
//                 color2++;
//             }else{
//                 color3++;
//             }
//         }
//         for (int i = 0; i < color1; i++) {
//             temp[i]=0;
//         }
//         for (int i = color1; i < color1+color2; i++) {
//             temp[i]=1;
//         }
//         for (int i = color1+color2; i < color1+color2+color3; i++) {
//             temp[i]=2;
//         }
        
//         arr=temp;
        
        //optimal solution
        //Dutch National Flag Algorithm
        //THIS ALGO SAYS :-
        //we have 3 variables
        //low
        //mid
        //high
        //form --> 0 - low-1 ----> 0's
        //form --> low - mid-1 ----> 1's
        //from --> high+1 - n-1 ----> 2's
        //FROM MID - HIGH ----> 0'S/1'S/2'S
        int low=0;
        int mid=0;
        int high=arr.length-1;
        while(mid<=high){
            int currentMid=arr[mid];
            if(currentMid == 0){
                swap(arr,mid,low);
                low++;
                mid++;
            }
            else if(currentMid == 1){
                mid++;
            }else{
                swap(arr,mid,high);
                high--;
            }
        }
    }

    public static void swap(int[] arr,int n1,int n2){
        int t=arr[n1];
        arr[n1]=arr[n2];
        arr[n2]=t;
    }
}