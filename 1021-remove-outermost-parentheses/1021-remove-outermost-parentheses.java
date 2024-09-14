class Solution {
    public String removeOuterParentheses(String s) {
        int sub=0;
        int st=0;
        int last=0;
        boolean start=false;
        boolean end=false;
        String res="";
        ArrayList<String> answers=new ArrayList<>();
        int c=0;
        for (int i = 0; i < s.length(); i++) {
            String p=s.charAt(i)+"";
            if(p.equals("(")){
                answers.add("(");
                c+=1;
                if(c==1){
                    if(!start){
                        st=i;
                        start=true;
                    }
                }

            }else{
                answers.add(")");
                c-=1;
                if(c==0){
                    last=i;
                }

            }
            if(c==0){
                answers.remove(last-sub);
                answers.remove(st-sub);
///// Ratatatatatatatatattatatattahhhhhh   (Above)
                sub+=2;
                start=false;
                end=false;
            }
        }
        for (int i = 0; i < answers.size(); i++) {
            res+= answers.get(i);
        }
        return res;
    }
}