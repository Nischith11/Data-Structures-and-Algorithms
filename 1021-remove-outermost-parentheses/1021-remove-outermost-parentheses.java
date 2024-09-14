class Solution {
    public String removeOuterParentheses(String s) {
        int open=0;
        int close=0;
        int start=0;
        int end=0;
        String res="";
        for (int i = 0; i < s.length(); i++) {
            String p=s.charAt(i)+"";
            if(p.equals("(")){
                open++;
            }else{
                close++;
            }
            if(open == close){
                end=i;
                res+=s.substring(start+1,end);
                start=i+1;
            }
        }
        return res;
    }
}