/*
1784. Check if Binary String Has at Most One Segment of Ones

Given a binary string s ​​​​​without leading zeros, return true​​​ if s contains at most one contiguous segment of ones. Otherwise, return false.

Example 1:
Input: s = "1001"
Output: false
Explanation: The ones do not form a contiguous segment.

Example 2:
Input: s = "110"
Output: true
*/

class Solution {
    public boolean checkOnesSegment(String s) {
        return !s.contains("01");
    }
}

class Solution {
    public boolean checkOnesSegment(String s) {
        char ch[] = s.toCharArray();
        int count = 0;
        for(int i=1;i<s.length();i++){
            if(ch[i] == '1' && ch[i-1] == '1'){
                count++;
            }
        }

        return count>0;
        
    }
}