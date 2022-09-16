/*
844. Backspace String Compare

Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.

Note that after backspacing an empty text, the text will continue empty.

Example 1:
Input: s = "ab#c", t = "ad#c"
Output: true
Explanation: Both s and t become "ac".

Example 2:
Input: s = "ab##", t = "c#d#"
Output: true
Explanation: Both s and t become "".

Example 3:
Input: s = "a#c", t = "b"
Output: false
Explanation: s becomes "c" while t becomes "b".
*/

class Solution {
    public boolean backspaceCompare(String S, String T) {
        String s = getString(S);
        String t = getString(T);
        return s.equals(t);
    }
    
    private String getString(String s) {
        StringBuilder str = new StringBuilder();
        char[] c = s.toCharArray();
        for (char ch : c) {
            if (ch == '#') {
                if ( str.length() != 0) {
                    str.deleteCharAt(str.length() - 1);
                }
            } else {
                str.append(ch);
            }
        }
        return str.toString();
    }
}   