/* 
242. Valid Anagram

Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
*/

import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        
        char ss[] = s.toCharArray();
        char tt[] = t.toCharArray();        
        
        Arrays.sort(ss);
        Arrays.sort(tt);
        
        if(Arrays.equals(ss,tt))
            return true;
        
        return false;
    }
}

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        
        
        int freq[] = new int[26];
        
        for(int i=0;i<s.length();i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            
            freq[c1 - 'a'] += 1;
            freq[c2 - 'a'] -= 1;            
        }
        
        for(int i : freq){
            if(i != 0){
                return false;
            }
        }
        return true;        
    }
}
