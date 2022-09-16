/*
796. Rotate String

Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.
 
Example 1:
Input: s = "abcde", goal = "cdeab"
Output: true

Example 2:
Input: s = "abcde", goal = "abced"
Output: false
*/

class Solution {
    public boolean rotateString(String s, String goal) {
        
        for(char c : s.toCharArray()){
            String firstPart = s.substring(0,1);
            String secondPart = s.substring(1,s.length());
            
            s = secondPart + firstPart;
            if(s.equals(goal)){
                return true;
            }
        }
        
        return false;
        
    }
}