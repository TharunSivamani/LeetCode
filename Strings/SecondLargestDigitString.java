/*
1796. Second Largest Digit in a String

Given an alphanumeric string s, return the second largest numerical digit that appears in s, or -1 if it does not exist.
An alphanumeric string is a string consisting of lowercase English letters and digits.

Example 1:
Input: s = "dfa12321afd"
Output: 2
Explanation: The digits that appear in s are [1, 2, 3]. The second largest digit is 2.

Example 2:
Input: s = "abc1111"
Output: -1
Explanation: The digits that appear in s are [1]. There is no second largest digit. 
*/

class Solution {
    public int secondHighest(String s) {

        ArrayList<Integer> list = new ArrayList<>();

        for(char c:s.toCharArray()){
            if(c>='0' && c<='9'){
                int num = c-'0';
                if(!list.contains(num)){
                    list.add(num);
                }

            }
        }

        Collections.sort(list);

        return list.size() > 1 ? list.get(list.size()-2) : -1;
        
    }
}