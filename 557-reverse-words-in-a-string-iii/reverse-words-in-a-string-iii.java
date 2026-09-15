class Solution {
    public String reverseWords(String s) {
//          int left   = 0;
//          int right = s.length-1;
//          while(left<right){
//        char[temp] = s[left];
//        s[left] = s[right];
//        s[right] = temp;
//        left++;
//        right--; 
//          }
//     }
// }

String[] words  = s.split(" ");
StringBuilder result  = new StringBuilder();
for(String word : words){
    StringBuilder reversed  = new StringBuilder(word);
    result.append(reversed.reverse()).append(" ");
}
return result.toString().trim();
    }
}
