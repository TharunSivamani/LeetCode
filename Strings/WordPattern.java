/*
290. Word Pattern
Easy
5.7K
654
Companies
Given a pattern and a string s, find if s follows the same pattern.

Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.

Example 1:
Input: pattern = "abba", s = "dog cat cat dog"
Output: true

Example 2:
Input: pattern = "abba", s = "dog cat cat fish"
Output: false

Example 3:
Input: pattern = "aaaa", s = "dog cat cat dog"
Output: false
*/

class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");
        HashMap<Character , String> map = new HashMap<>();

        if(pattern.length() != words.length) return false;
        for(int i=0;i<pattern.length();i++){
            char current = pattern.charAt(i);

            if(map.containsKey(current)){
                if(!map.get(current).equals(words[i])){
                    return false;
                }
            }else{
                if(map.containsValue(words[i])){
                    return false;
                }
                map.put(current,words[i]);
            }
        }

        return true;
        
    }
}