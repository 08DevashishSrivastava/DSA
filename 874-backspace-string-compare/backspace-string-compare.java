// class Solution {
//     public boolean backspaceCompare(String s, String t) {
    //  Integer<character , character>  st = new Integer<>();
    //  ch = s.charAt[i];
    //  ch = t.charAt[i];
    //  for(int i = 0 ; i < s.length ; i++){
    //     while(s.length() == t.length()){
    //         if(s.charAt(i) && t.char(i) == " #"){
    //               count++;
    //         }
    //     }
    //       ch  =     s.compare(s.length == t.length)
    //  }   
    //  return st;
    // }
//     Stack<Character> st1 = new stack<>();
//     Stack<Character> st2 = new stack<>();
//     for(int  i = 0 ; i < s.length() ; i++){
//         if(s.charAt(i) == ' # '){
//             if(!st1.isEmpty()){
//                 st1.pop();
//             }
//             else{
//                 st1.push(s.charAt(i));
//             }
//         }
//         if(t.charAt(i) == ' # '){
//             if(!st2.isEmpty()){
//                 st2.pop();
//             }
//             else{
//                 st2.push(s.charAt(i));
//             }
//         }
//         return st1.equals(st2);
//     }
// }

// import java.util.Stack;

class Solution {
    public boolean backspaceCompare(String s, String t) {

        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '#') {

                if (!st1.isEmpty()) {
                    st1.pop();
                }

            } else {
                st1.push(s.charAt(i));
            }
        }

        for (int i = 0; i < t.length(); i++) {

            if (t.charAt(i) == '#') {

                if (!st2.isEmpty()) {
                    st2.pop();
                }

            } else {
                st2.push(t.charAt(i));
            }
        }

        return st1.equals(st2);
    }
}