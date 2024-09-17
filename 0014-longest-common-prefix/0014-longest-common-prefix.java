class Solution {
    public String longestCommonPrefix(String[] a) {
        int min=a[0].length();
        String res="";
        int minindex=0;
        int c=0;
        for(String n:a){
            if(n.length() < min){
                minindex=c;
            }
            c++;
        }
        String low=a[minindex];
        for (int i = 0; i < low.length(); i++) {
            char p=low.charAt(i);
            for (int j = 0; j < a.length; j++) {
                String current=a[j];
                char jch=current.charAt(i);
                if(p!=jch){
                    return res;
                }
            }
            res+=p;
        }
        return res;
    }
}