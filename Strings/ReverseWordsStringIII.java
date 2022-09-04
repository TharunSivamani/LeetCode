/*
557. Reverse Words in a String III

Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

Example 1:
Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

Example 2:
Input: s = "God Ding"
Output: "doG gniD"
*/

class Solution {
    public String reverseWords(String s) {
        
        String[] str = s.split(" ");
        
        StringBuilder s1 = new StringBuilder();
        StringBuilder res = new StringBuilder();
        
        for(int i=0;i<str.length;i++){
            s1.append(str[i]);
            res.append(s1.reverse()+" ");
            s1.delete(0, s1.length());
        }
        
        return res.toString().trim();
        
    }
}