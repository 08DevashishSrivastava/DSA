// class Solution {
//     public boolean isIsomorphic(String s, String t) {
//        Hashmap<character , character > hm = new hasmap<>();
//        Hashmap<character , character > reverse = new hashmap<>();
//        char a = s.charAt(i);
//        char b = t.charAt(i);
//        for(int  i = 0 ; i < str.length ; i++){
//            if(hm.containkey(s.charAt[i])){
//             if(!= hm.get(s.charAt(i).equal(t.charAt(i))) ){
//                 return false;
//             }
//           else  {
//            if(hm.conatin(s.charAt[i])){
//           return false;
//            }
//            hm.put(s.charAt[i] , t.charAt[i])
//        }
//        return true;
// }
class Solution {

    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> hm = new HashMap<>();

        HashMap<Character, Character> reverse = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            char a = s.charAt(i);
            char b = t.charAt(i);

            if (hm.containsKey(a)) {

                if (hm.get(a) != b) {
                    return false;
                }

            } else {

                if (reverse.containsKey(b)) {
                    return false;
                }

                hm.put(a, b);
                reverse.put(b, a);
            }
        }

        return true;
    }
}
//  nhi a rha h 
