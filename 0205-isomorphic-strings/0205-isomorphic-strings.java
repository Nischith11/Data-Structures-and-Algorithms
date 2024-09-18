class Solution {
    public boolean isIsomorphic(String s, String t) {
//         String checkans="";
//         if (s.length() != t.length()) {
//             return false;
//         }
//         HashMap<Character, Character> map = new HashMap<>();
//         for (int i = 0; i < t.length(); i++) {
//             map.put(t.charAt(i),s.charAt(i));
//         }

//         for (int i = 0; i < s.length(); i++) {
//             char p=s.charAt(i);
//             if(map.containsValue(p)){
//                 Iterator itr=map.keySet().iterator();
//                 while (itr.hasNext()){
//                     Character ch=(Character)itr.next();
//                     if(map.get(ch) == p){
//                         checkans+=ch;
//                         break;
//                     }
//                 }
//             }else{
//                 return false;
//             }
//         }
//         if(checkans.equals(t)){
//             return true;
//         }else{
//             return false;
//         }
        
        //OPTIMAL SOLUTION
        String checkans="";
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            if(map.isEmpty() || !map.containsValue(t.charAt(i))){
            map.put(s.charAt(i),t.charAt(i));
        }
        }
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                checkans+=map.get(ch);
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