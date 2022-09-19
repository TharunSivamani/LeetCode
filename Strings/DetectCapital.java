/*
520. Detect Capital

We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right. 

Example 1:
Input: word = "USA"
Output: true

Example 2:
Input: word = "FlaG"
Output: false
*/

class Solution {
    public boolean detectCapitalUse(String word) {
        int capitals = 0;
        for(char ch : word.toCharArray()) {
            if(Character.isUpperCase(ch))
                capitals++;
        }
        
        if(capitals == word.length() || capitals == 0) return true;
        
        return capitals == 1 && Character.isUpperCase(word.charAt(0));  
    }
}