/* 
1408. String Matching in an Array

Given an array of string words. Return all strings in words which is substring of another word in any order. 

String words[i] is substring of words[j], if can be obtained removing some characters to left and/or right side of words[j].

Example 1:
Input: words = ["mass","as","hero","superhero"]
Output: ["as","hero"]
Explanation: "as" is substring of "mass" and "hero" is substring of "superhero".
["hero","as"] is also a valid answer.

Example 2:
Input: words = ["leetcode","et","code"]
Output: ["et","code"]
Explanation: "et", "code" are substring of "leetcode".

Example 3:
Input: words = ["blue","green","bu"]
Output: []
*/

class Solution {
    public List<String> stringMatching(String[] words) {
        
        Set<String> set = new HashSet<>();
        
        for(int i=0;i<words.length;i++){
            String currWord = words[i];
            for(int j=i+1;j<words.length;j++){
                String nextWord = words[j];
                
                if(currWord.contains(nextWord)){
                    set.add(nextWord);
                }
                
                if(nextWord.contains(currWord)){
                    set.add(currWord);
                }
            }
        }
        
        return new ArrayList<>(set);
        
    }
}