// class Solution {
//     public boolean detectCapitalUse(String word) {
//         int cap = 0 ;
//         int low = 0 ;
//         int first = 0 ;
//         for(char ch : word : tocharArray()){
//             if(ch>=65 && ch<=90){
//                 cap++;
//             if(first == 0){
//                 first == 1;
//             }
//             else{
//                 low++;
//                 if(first == 0){
//                     first == 2;
//                 }
//             }
//             if(cap == 0 || low == 0 || fist == 0 && cap == 1){
//                 return true;
//             }
//             else{
//                 return false;
//             }
//             }
//         }
//     }
// }


class Solution {

    public boolean detectCapitalUse(String word) {

        int cap = 0;
        int low = 0;
        int first = 0;

        for(char ch : word.toCharArray()){

            if(ch >= 65 && ch <= 90){
                cap++;

                if(first == 0){
                    first = 1;
                }
            }
            else{
                low++;

                if(first == 0){
                    first = 2;
                }
            }
        }

        if(cap == word.length() || low == word.length()){
            return true;
        }

        if(cap == 1 && first == 1){
            return true;
        }

        return false;
    }
}