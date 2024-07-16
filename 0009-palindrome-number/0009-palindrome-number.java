class Solution {
    public boolean isPalindrome(int x) {
        int original=x;
        if(original<0){
            return false;
        }
        int lastdigit=0;
        while(original>0){
            lastdigit=lastdigit*10+(original%10);
            original=original/10;
        }
        if(lastdigit == x){
            return true;
        }
        return false;
    }
}