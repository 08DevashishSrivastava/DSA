class Solution {
    public void reverseString(char[] s) {
        String str = new String(s);
        String reverseStr = (" ");
        char ch;
        for(int  i = 0 ; i<str.length(); i++){
            ch = str.charAt(i);
            reverseStr = ch + reverseStr ;
        }
        for(int i = 0 ; i<s.length; i++){
            s[i] = reverseStr.charAt(i);
        }
    }
}
