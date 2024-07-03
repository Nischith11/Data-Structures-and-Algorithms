import java.util.*;
class Solution {
    public int singleNumber(int[] array) {
        //better solution
        // int ans=-1;
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<array.length;i++){
        //     int value=map.getOrDefault(array[i],0);
        //     map.put(array[i],value+1);
        // }
        // //for(Integer it:arr)
        // for(Map.Entry<Integer,Integer> it:map.entrySet()){
        //     int freq=it.getValue();
        //     if(freq == 1){
        //         ans=it.getKey();
        //     }
        // }
        // return ans;
        
        //optimal solution
        int x =0;
        for(int i=0;i<array.length;i++)
        {
            x = x^array[i];
        }
        return x;
    }
}