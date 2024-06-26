class Solution {
    public String frequencySort(String name) {
        String ans="";
        int[] hashArray=new int[128];
        Arrays.fill(hashArray,0);
        for (int i = 0; i < name.length(); i++) {
            char v=name.charAt(i);
            hashArray[v]++;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i <128 ; i++) {
            if(hashArray[i]!=0) {
                map.put((char)i,hashArray[i]);
            }
        }
        while(!map.isEmpty()){
            int max=Integer.MIN_VALUE;
            for(Map.Entry<Character,Integer> e:map.entrySet()) {
                if(e.getValue() > max){
                    max=e.getValue();
            }
            }
            char val='\u0000';
            for(Map.Entry<Character,Integer> n:map.entrySet()) {
                boolean find=false;
                if(n.getValue() == max){
                    val=n.getKey();
                    for (int i = 0; i < max; i++) {
                        ans+=n.getKey();
                        find=true;
                    }
            }
                if(find){
                    break;
                }
            }
            map.remove(val);
        }
        return ans;
    }
}