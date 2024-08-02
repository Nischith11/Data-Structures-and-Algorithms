class Solution {
    public int[] twoSum(int[] array, int target) {
        int[] result;
        HashMap<Integer,Integer> maps=new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            int value=array[i];
            int rem=target-value;
            if(maps.containsKey(rem)){
                result=new int[]{i,maps.get(rem)};
                return result;
            }else{
                maps.put(array[i],i);
            }
        }
        return new int[]{-1,-1};
    }
}