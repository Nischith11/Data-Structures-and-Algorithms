class Solution {
    public String largestOddNumber(String n) {
       int largestOdd=-1;
        String strval="";
        for (int i = n.length()-1; i >=0 ; i--) {
            char ch=n.charAt(i);
            int intval=ch - '0';
            if(intval%2 != 0){
                if(i == 0){
                    strval+=n.charAt(0);
                    return strval;
                }else {
                    strval += n.substring(0, i + 1);
                    return strval;
                }
            }
        }
        return strval;

    }
}