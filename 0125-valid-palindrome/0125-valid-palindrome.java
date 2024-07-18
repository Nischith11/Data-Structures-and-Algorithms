class Solution {
    public boolean isPalindrome(String s) {
        String dup=s;
        String lower=dup.toLowerCase();
        String ans="";
        String onlystr="";
        for(int i=0;i<lower.length();i++){
            char ch=lower.charAt(i);
            if((ch >= 48 && ch <= 57) || (ch >= 97 && ch <= 122)){
                onlystr+=ch;
            }
        }
        for(int i=onlystr.length()-1;i>=0;i--){
            char ch=onlystr.charAt(i);
            if((ch >= 48 && ch <= 57) || (ch >= 97 && ch <= 122)){
                ans+=ch;
            }
        }
        if(onlystr.equals(ans)){
            return true;
        }
        return false;
    }
}