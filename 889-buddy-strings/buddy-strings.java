// class Solution {
//     public boolean buddyStrings(String s, String goal) {
//         if(s.length != goal.length){
//             return fasle;
//         }
//         int first = -1;
//         int second  = -1;
//      for(int  i = 0 ; i < s.length ; i++){
//         if(s.charAt(i) != goal.charAt(i))
//         if(first == 1){
//             first = i ;
//         }
//         if(second  == 1){
//             second  = i;
//         }
//         else {
//             return false;
//         }

//      }
//  }
//  if (first == -1) {
//  int[]count  = new  count[26];
//  for(int  i = 0 ; i < s.length ; i++){
//     char c  = s.charAt(i);
//     count[ c -  'a']++;
//     if(count[c - 'a'] >= 2) {
//         return false;
//     } 

//  }
//  return false;

//  if(second  == -1){
//     return false;
//  }

//  return s.charAt(first) == goal.charAt(second) &&  s.charAT(second) == goal.charAt(first);
// }
// }
    

//     //  nhi arha h 
//     // 1790
//     // 1657
//     // 2531

    
    class Solution {

    public boolean buddyStrings(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        int first = -1;
        int second = -1;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != goal.charAt(i)) {

                if (first == -1) {
                    first = i;
                } 
                else if (second == -1) {
                    second = i;
                } 
                else {
                    return false;
                }
            }
        }

        if (first == -1) {

            int[] count = new int[26];

            for (int i = 0; i < s.length(); i++) {

                char c = s.charAt(i);

                count[c - 'a']++;

                if (count[c - 'a'] >= 2) {
                    return true;
                }
            }

            return false;
        }

        if (second == -1) {
            return false;
        }

        return s.charAt(first) == goal.charAt(second)
            && s.charAt(second) == goal.charAt(first);
    }
}