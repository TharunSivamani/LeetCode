/* 
1832. Check if the Sentence Is Pangram

A pangram is a sentence where every letter of the English alphabet appears at least once.

Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.

Example 1:

Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
Output: true
Explanation: sentence contains at least one of every letter of the English alphabet.
Example 2:

Input: sentence = "leetcode"
Output: false
*/
import java.util.*;

class Solution {
    public boolean checkIfPangram(String sentence) {

        HashSet<Character> set = new HashSet<>();

        for (Character c : sentence.toCharArray()) {
            if (!set.contains(c)) {
                set.add(c);
            }
        }

        if (set.size() == 26) {
            return true;
        }
        return false;

    }
}

// Solution 2

class Solution2 {
    public boolean checkIfPangram(String sentence) {
        
        int freq[] = new int[26];
        
        for(int i=0;i<sentence.length();i++){
            int k = sentence.charAt(i) - 'a';
            freq[k]++;
        }
        
        for(int j=0;j<freq.length;j++){
            if(freq[j] == 0) return false;
        }
        
        return true;
    }
}