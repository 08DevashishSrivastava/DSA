// class Solution {
//     public String toGoatLatin(String sentence) {
//         String[] words = sentence.split(" ");
//         StringBuilder str = new StringBuilder();
//             for(int  i = 0 ; i < words.length ; i++){
//                 String word  = words[i];
//                 char first = word.charAt(0);

//                 if (first != 'a' && first != 'e' && first != 'i' && first != 'o' && first != 'u' && first != 'A' && first != 'E' && first != 'I' && first != 'O' && first != 'U') { 
//                     word = word.substring(1) + first; 
//                     }
//                     word = word + "ma";
//             }
//            for (int j = 0; j <= i; j++){
//                 word = word + "a";
//             }
//             result.append(word);
//             if(word.length < 1){
//                 result.append("");
//             }
    
//     return result.toString();

//     }
// }

class Solution {
    public String toGoatLatin(String sentence) {

        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            String word = words[i];
            char first = word.charAt(0);

       
            if (first != 'a' && first != 'e' && first != 'i' &&
                first != 'o' && first != 'u' &&
                first != 'A' && first != 'E' && first != 'I' &&
                first != 'O' && first != 'U') {

                word = word.substring(1) + first;
            }

       
            word = word + "ma";

         
            for (int j = 0; j <= i; j++) {
                word = word + "a";
            }

            result.append(word);

           
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}
