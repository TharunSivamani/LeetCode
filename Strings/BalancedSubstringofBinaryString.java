/*
2609. Find the Longest Balanced Substring of a Binary String

You are given a binary string s consisting only of zeroes and ones.

A substring of s is considered balanced if all zeroes are before ones and the number of zeroes is equal to the number of ones inside the substring. Notice that the empty substring is considered a balanced substring.

Return the length of the longest balanced substring of s.

A substring is a contiguous sequence of characters within a string.

Example 1:
Input: s = "01000111"
Output: 6
Explanation: The longest balanced substring is "000111", which has length 6.

Example 2:
Input: s = "00111"
Output: 4
Explanation: The longest balanced substring is "0011", which has length 4. 

Example 3:
Input: s = "111"
Output: 0
Explanation: There is no balanced substring except the empty substring, so the answer is 0.
*/

class Solution {
    public int findTheLongestBalancedSubstring(String s) {

        int res = 0;

        String temp = "01";

        while(temp.length() <= s.length()){
            if(s.contains(temp)){
                res = temp.length();
            }
            temp = "0" + temp + "1";
        }

        return res;
        
    }
}

class Solution {
    public int findTheLongestBalancedSubstring(String s) {

        int zero = 0;
        int one = 0;
        int max = Integer.MIN_VALUE;
        int i=0;

        while(i<s.length()){
            while(i<s.length() && s.charAt(i) == '0'){
                zero++;
                i++;
            }
            while(i<s.length() && s.charAt(i) == '1'){
                one++;
                i++;
            }

            max = Math.max(max,2*Math.min(one,zero));
            zero=0;
            one=0;
        }

        return max;
        
    }
}