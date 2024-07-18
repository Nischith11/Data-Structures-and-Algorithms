class Solution {
    public boolean isPalindrome(String s) {
        //This one is the BRUTE FORCE SOLUTION
        // String dup=s;
        // String lower=dup.toLowerCase();
        // String ans="";
        // String onlystr="";
        // for(int i=0;i<lower.length();i++){
        //     char ch=lower.charAt(i);
        //     if((ch >= 48 && ch <= 57) || (ch >= 97 && ch <= 122)){
        //         onlystr+=ch;
        //     }
        // }
        // for(int i=onlystr.length()-1;i>=0;i--){
        //     char ch=onlystr.charAt(i);
        //     if((ch >= 48 && ch <= 57) || (ch >= 97 && ch <= 122)){
        //         ans+=ch;
        //     }
        // }
        // if(onlystr.equals(ans)){
        //     return true;
        // }
        // return false;
        //Time complexity = O(Lenght of the GivenString) + O(Lenght of the only alphaNumeric String)
        
        //OPTIMAL SOLUTION
        //Using TWO POINTER APPROACH
        if(s.isEmpty()){
            return true;
        }
        String lower=s.toLowerCase();
        int pointer1=0;
        int pointer2=lower.length()-1;
        while(pointer1<=pointer2){
            char ch1=lower.charAt(pointer1);
            char ch2=lower.charAt(pointer2);
            if(((ch1 >=48 && ch1 <= 57) || (ch1 >=97 && ch1 <= 122)) && ((ch2 >=48 && ch2 <= 57) || (ch2 >=97 && ch2 <= 122))){
                if(ch1 == ch2){
                    pointer1++;
                    pointer2--;
                }else{
                    return false;
                }
            }
            else if(((ch1 >=48 && ch1 <= 57) || (ch1 >=97 && ch1 <= 122)) && !((ch2 >=48 && ch2 <= 57) || (ch2 >=97 && ch2 <= 122))){
                pointer2--;
            }
            else if(!((ch1 >=48 && ch1 <= 57) || (ch1 >=97 && ch1 <= 122)) && ((ch2 >=48 && ch2 <= 57) || (ch2 >=97 && ch2 <= 122))){
                pointer1++;
            }
            else{
                pointer1++;
                pointer2--;
            }
        }
        return true;
    }
}