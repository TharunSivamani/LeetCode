/*
2315. Count Asterisks


You are given a string s, where every two consecutive vertical bars '|' are grouped into a pair. In other words, the 1st and 2nd '|' make a pair, the 3rd and 4th '|' make a pair, and so forth.

Return the number of '*' in s, excluding the '*' between each pair of '|'.

Note that each '|' will belong to exactly one pair.
 

Example 1:

Input: s = "l|*e*et|c**o|*de|"
Output: 2
Explanation: The considered characters are underlined: "l|*e*et|c**o|*de|".
The characters between the first and second '|' are excluded from the answer.
Also, the characters between the third and fourth '|' are excluded from the answer.
There are 2 asterisks considered. Therefore, we return 2.

Example 2:

Input: s = "iamprogrammer"
Output: 0
Explanation: In this example, there are no asterisks in s. Therefore, we return 0.
Example 3:

Input: s = "yo|uar|e**|b|e***au|tifu|l"
Output: 5
Explanation: The considered characters are underlined: "yo|uar|e**|b|e***au|tifu|l". There are 5 asterisks considered. Therefore, we return 5.
*/


class Solution {
    public int countAsterisks(String s) {
        int res=0;
        Stack<Character> st=new Stack<>();
        
        for(char c:s.toCharArray()){
            if(c=='*'){
                if(st.isEmpty()){
                    res++;
                }
            }
            
            if(c=='|'){
                if(st.isEmpty())
                    st.add('|');
                else
                    st.pop();
            }
            
        }
        return res;
    }
}


// Second Approach

class Solution {
    public int countAsterisks(String s) {
        
        String[] words = s.split("\\|");
        
        int res=0;
        
        for(int i=0;i<words.length;i+=2){
            for(Character c : words[i].toCharArray()){
                if(c=='*'){
                    res++;
                }
            }
        }
        return res;
        
    }
}