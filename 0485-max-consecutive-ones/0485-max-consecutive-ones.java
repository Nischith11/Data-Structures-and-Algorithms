class Solution {
    public int findMaxConsecutiveOnes(int[] array) {
        int pointer=0;
        int count=0;
        int max=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 0){
                count=0;
            }else{
                count++;
                if(count > max){
                    max=count;
                }
            }
        }
        return max;
    }
}