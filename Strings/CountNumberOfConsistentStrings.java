/* 
1684. Count the Number of Consistent Strings

You are given a string allowed consisting of distinct characters and an array of strings words. A string is consistent if all characters in the string appear in the string allowed.

Return the number of consistent strings in the array words.

 

Example 1:

Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
Output: 2
Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
Example 2:

Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
Output: 7
Explanation: All strings are consistent.
Example 3:

Input: allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
Output: 4
Explanation: Strings "cc", "acd", "ac", and "d" are consistent.
*/

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        HashSet<Character> set = new HashSet<>();
        
        for(int i=0;i<allowed.length();i++){
            set.add(allowed.charAt(i));
        }
        
        int res = 0;
        
        for(int i=0;i<words.length;i++){
            String current_string = words[i];
        
            int count = 0;
            
            for(int j=0;j<current_string.length();j++){
                Character c = current_string.charAt(j);
                
                if(set.contains(c)){
                    count++;
                }
            }
            
            if(count == current_string.length()){
                res++;
            }
            
        }
        
        return res;       
    }
}

// Solution using ArrayList 

class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        int res = 0;

        ArrayList<Character> list = new ArrayList<Character>();

        for (int i = 0; i < allowed.length(); i++) {
            if (!list.contains(allowed.charAt(i))) {
                list.add(allowed.charAt(i));
            }
        }

        for (int i = 0; i < words.length; i++) {
            String current = words[i];
            int str_count = 0;
            for (int j = 0; j < current.length(); j++) {
                if (list.contains(current.charAt(j))) {
                    str_count++;
                }
            }

            if (str_count == current.length()) {
                res++;
            }
        }
        
        return res;
        
    }
}