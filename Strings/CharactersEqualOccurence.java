/*  
1941. Check if All Characters Have Equal Number of Occurrences

Given a string s, return true if s is a good string, or false otherwise.

A string s is good if all the characters that appear in s have the same number of occurrences (i.e., the same frequency).

Example 1:

Input: s = "abacbc"
Output: true
Explanation: The characters that appear in s are 'a', 'b', and 'c'. All characters occur 2 times in s.
Example 2:

Input: s = "aaabb"
Output: false
Explanation: The characters that appear in s are 'a' and 'b'.
'a' occurs 3 times while 'b' occurs 2 times, which is not the same number of times.
*/
import java.util.*;

class Solution {
    public boolean areOccurrencesEqual(String s) {
        
        HashMap<Character , Integer> map = new HashMap<>();
        
        for(Character c : s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else{
                map.put(c,1);
            }
                
        }
        
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i< s.length() ; i++){
            set.add(map.get(s.charAt(i)));
        }
        
        if(set.size() == 1) return true;
        return false;
        
    }
}