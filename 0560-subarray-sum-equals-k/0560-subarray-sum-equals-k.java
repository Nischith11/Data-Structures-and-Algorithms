class Solution {
    public int subarraySum(int[] nums, int k) {
        int prefixSum=0;
        int count=0;
        HashMap<Integer,Integer> maps=new HashMap<>();
        maps.put(0,1);
        for(int i=0;i<nums.length;i++){
            prefixSum+=nums[i];
            int rem=prefixSum - k;
            if(maps.containsKey(rem)){
                int val=maps.get(rem);
                count+=val;
            }
            int values=maps.getOrDefault(prefixSum,0);
            maps.put(prefixSum,values+1);
        }
        return count;
    }
}