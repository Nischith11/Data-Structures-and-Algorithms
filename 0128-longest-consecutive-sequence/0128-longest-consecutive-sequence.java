class Solution {
    public int longestConsecutive(int[] array) {
        HashSet<Integer> sets=new HashSet<>();
        for(int i=0;i<array.length;i++){
            sets.add(array[i]);
        }
        int start=-1;
        int count=0;
        int longest=0;
        for(Integer it:sets){
            Integer value=it;
            if(!sets.contains(value - 1)){
                start=value;
                count=1;
                while(sets.contains(start + 1)){
                    count++;
                    start=start+1;
                }
            }
            longest=Math.max(longest,count);
        
        }
        return longest;
    }

}