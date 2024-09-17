class Solution {
    public String reverseWords(String s) {
        s=s.trim();
       String res="";
        s+=" ";
        Stack<String> stack=new Stack<>();
        String puting="";
        int st=0;
        int e=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' '){
                if(!puting.isEmpty()){
                    stack.push(puting);
                    puting="";
                }
            }else{
                puting+=s.charAt(i);
                st=i+1;
            }
        }
        while(stack.size()>1){
            res+=stack.pop();
            res+=" ";
        }
        res+=stack.pop();
        return res;
    }
}