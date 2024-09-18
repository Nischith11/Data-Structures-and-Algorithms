class Solution {
    public boolean isIsomorphic(String s, String t) {
        String checkans="";
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i),s.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            char p=s.charAt(i);
            if(map.containsValue(p)){
                Iterator itr=map.keySet().iterator();
                while (itr.hasNext()){
                    Character ch=(Character)itr.next();
                    if(map.get(ch) == p){
                        checkans+=ch;
                        break;
                    }
                }
            }else{
                return false;
            }
        }
        if(checkans.equals(t)){
            return true;
        }else{
            return false;
        }
    }
}