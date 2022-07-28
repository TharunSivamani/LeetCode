/* 
709. To Lower Case

Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.

Example 1:

Input: s = "Hello"
Output: "hello"
Example 2:

Input: s = "here"
Output: "here"
Example 3:

Input: s = "LOVELY"
Output: "lovely"
*/

class Solution {
    public String toLowerCase(String s) {
        
        String res = s.toLowerCase();
        
        return res;
        
    }
}

class Solution2 {
    public String toLowerCase(String s) {
        
        char[] ch = s.toCharArray();
        
        for(int i=0;i<ch.length;i++){
            if(ch[i] > 64 && ch[i] < 91){
                ch[i] += 32;
            }
        }
        
        return String.valueOf(ch);        
        
    }
}