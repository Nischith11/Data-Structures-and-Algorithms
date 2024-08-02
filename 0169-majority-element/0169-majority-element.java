class Solution {
    public int majorityElement(int[] arr) {
        int ans=-1;
        int n=arr.length;
        int majority=n/2;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int val=map.getOrDefault(arr[i],0);
            map.put(arr[i],val+1);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            int freq=e.getValue();
            if(freq > majority){
                return ans=e.getKey();
            }
        }
        return -1;
    }
}