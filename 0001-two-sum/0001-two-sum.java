class Solution {
    public int[] twoSum(int[] array, int target) {
         int[] ansarray=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int val=array[i];
            int rem=target-val;
            if(map.containsKey(rem)){
                ansarray[0]=map.get(rem);
                ansarray[1]=i;
                break;
            }else{
                map.put(val,i);
            }
        }
        return ansarray;
    }
}