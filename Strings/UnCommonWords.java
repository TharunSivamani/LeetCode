/* 
884. Uncommon Words from Two Sentences

A sentence is a string of single-space separated words where each word consists only of lowercase letters.

A word is uncommon if it appears exactly once in one of the sentences, and does not appear in the other sentence.

Given two sentences s1 and s2, return a list of all the uncommon words. You may return the answer in any order.

Example 1:

Input: s1 = "this apple is sweet", s2 = "this apple is sour"
Output: ["sweet","sour"]
Example 2:

Input: s1 = "apple apple", s2 = "banana"
Output: ["banana"]
*/

import java.util.*;
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        
        HashMap<String , Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder("");
        String res = s1+" "+s2;
        
        for(String s : res.split(" ")){
            map.put(s , map.getOrDefault(s , 0)+1);
        }
        
        for(String s : map.keySet()){
            if(map.get(s) == 1){
                sb.append(s+" ");
            }
        }
        
        if(sb.toString().equals(""))
            return new String[0];
        
        return sb.toString().trim().split(" ");
        
    }
}