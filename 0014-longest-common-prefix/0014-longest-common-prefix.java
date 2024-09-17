class Solution {
    public String longestCommonPrefix(String[] a) {
        String res="";
        String f=a[0];
        for (int i = 0; i < f.length(); i++) {
            char p=f.charAt(i);
            for (int j = 1; j < a.length; j++) {
                String current = a[j];
                int clen = current.length();
                if (i < clen) {
                    char jch = current.charAt(i);
                    if (p != jch) {
                        return res;
                    }
                }else{
                    return res;
                }
            }
            res+=p;
        }
        return res;
    }

}
