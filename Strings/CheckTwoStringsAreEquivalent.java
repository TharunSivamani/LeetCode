/* 
2068. Check Whether Two Strings are Almost Equivalent

Two strings word1 and word2 are considered almost equivalent if the differences between the frequencies of each letter from 'a' to 'z' between word1 and word2 is at most 3.

Given two strings word1 and word2, each of length n, return true if word1 and word2 are almost equivalent, or false otherwise.

The frequency of a letter x is the number of times it occurs in the string.

Example 1:
Input: word1 = "aaaa", word2 = "bccb"
Output: false
Explanation: There are 4 'a's in "aaaa" but 0 'a's in "bccb".
The difference is 4, which is more than the allowed 3.

Example 2:
Input: word1 = "abcdeef", word2 = "abaaacc"
Output: true
Explanation: The differences between the frequencies of each letter in word1 and word2 are at most 3:
- 'a' appears 1 time in word1 and 4 times in word2. The difference is 3.
- 'b' appears 1 time in word1 and 1 time in word2. The difference is 0.
- 'c' appears 1 time in word1 and 2 times in word2. The difference is 1.
- 'd' appears 1 time in word1 and 0 times in word2. The difference is 1.
- 'e' appears 2 times in word1 and 0 times in word2. The difference is 2.
- 'f' appears 1 time in word1 and 0 times in word2. The difference is 1.

Example 3:
Input: word1 = "cccddabba", word2 = "babababab"
Output: true
Explanation: The differences between the frequencies of each letter in word1 and word2 are at most 3:
- 'a' appears 2 times in word1 and 4 times in word2. The difference is 2.
- 'b' appears 2 times in word1 and 5 times in word2. The difference is 3.
- 'c' appears 3 times in word1 and 0 times in word2. The difference is 3.
- 'd' appears 2 times in word1 and 0 times in word2. The difference is 2.
*/

import java.util.*;

class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        
        HashMap<Character , Integer> map = new HashMap<>();
        
        for(char c : word1.toCharArray()){
            map.put(c , map.getOrDefault(c , 0)+1);
        }
        
        for(char c : word2.toCharArray()){
            map.put(c , map.getOrDefault(c , 0)-1);
        }
        
        for(char c : map.keySet()){
            if(map.get(c) > 3 || map.get(c) <-3){
                return false;
            }
        }
        
        return true;
        
    }
}

class Solution2 {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        
        for(char c : word1.toCharArray()){
            freq1[c - 'a']++;
        }
        
        for(char c : word2.toCharArray()){
            freq2[c - 'a']++;
        }
        
        for(int i=0;i<26;i++){
            if(Math.abs(freq1[i] - freq2[i]) > 3){
                return false;
            }
        }
        
        return true;
    }
}

class Solution3 {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        
        HashMap<Character,Integer> map2 = new HashMap<>();
        
        for(char ch1: word1.toCharArray()){
            map1.put(ch1, map1.getOrDefault(ch1,0)+1);
        }
        
        for(char ch2: word2.toCharArray()){
            map2.put(ch2, map2.getOrDefault(ch2,0)+1);
        }
        
        String word3 = word1+word2;
        for(char ch3: word3.toCharArray()){
            if(Math.abs(map1.getOrDefault(ch3,0)- map2.getOrDefault(ch3,0)) >3){
                return false;
            }
        }
        return true;
    }
}