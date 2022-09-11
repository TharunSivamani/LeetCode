/*
1897. Redistribute Characters to Make All Strings Equal

You are given an array of strings words (0-indexed).

In one operation, pick two distinct indices i and j, where words[i] is a non-empty string, and move any character from words[i] to any position in words[j].

Return true if you can make every string in words equal using any number of operations, and false otherwise.

Example 1:
Input: words = ["abc","aabc","bc"]
Output: true
Explanation: Move the first 'a' in words[1] to the front of words[2],
to make words[1] = "abc" and words[2] = "abc".
All the strings are now equal to "abc", so return true.

Example 2:
Input: words = ["ab","a"]
Output: false
Explanation: It is impossible to make all the strings equal using the operation.
*/


import java.util.*;

class Solution {
    public boolean makeEqual(String[] words) {
        
        int n = words.length;
        
        HashMap<Character , Integer> map = new HashMap<>();
        
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                map.put(words[i].charAt(j) , map.getOrDefault(words[i].charAt(j) , 0)+1);
            }
        }
        
        for(char c : map.keySet()){
            if(map.get(c) % n != 0){
                return false;
            }
        }
        
        return true;
        
        
    }
}