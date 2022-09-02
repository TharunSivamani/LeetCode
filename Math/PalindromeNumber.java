/*
9. Palindrome Number

Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

For example, 121 is a palindrome while 123 is not.
 
Example 1:
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

Example 2:
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
*/

class Solution {
    public boolean isPalindrome(int x) {
        
        if(x<0){
            return false;
        }
        
        int n = x;
        int sum = 0;
        int res=0;
        while(n!=0){
            res = n%10;
            n = n/10;
            sum = (sum*10)+res;
        }
        
        return true ? sum == x : false;
        
    }
}

// Solution 2

class Solution2 {
    public boolean isPalindrome(int x) {
        
        String str = String.valueOf(x);
        int start = 0;
        int end = str.length()-1;
        
        while(start<end){
            if(str.charAt(start++) != str.charAt(end--)){
                return false;
            }
        }
        
        return true;
        
    }
}