class Solution {
    public int majorityElement(int[] arr) {
        // int ans=-1;
        // int n=arr.length;
        // int majority=n/2;
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for (int i = 0; i < arr.length; i++) {
        //     int val=map.getOrDefault(arr[i],0);
        //     map.put(arr[i],val+1);
        // }
        // for(Map.Entry<Integer,Integer> e:map.entrySet()){
        //     int freq=e.getValue();
        //     if(freq > majority){
        //         return ans=e.getKey();
        //     }
        // }
        // return -1;
        //This above one is the better solution
        //T.C -- > O(N) + O(N)
        //S.C --> O(N)
        
        //optimal solution
        //Moores's Voting Algorithm
        int element=arr[0];
        int count=1;
        if(arr.length == 1){
            return arr[0];
        }else{
            for(int i=1;i<arr.length;i++){
                if(count == 0){
                    element=arr[i];
                    count++;
                }
                else if(arr[i] == element){
                    count++;
                }else{
                    count--;
                }
            }
            
        }
        return element;
        //The T.C of this optimal approach is O(N)
        
        }
}