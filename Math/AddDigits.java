/*
258. Add Digits

Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

Example 1:
Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.

Example 2:
Input: num = 0
Output: 0
*/

class Solution {

    public static int sum(int n){
        int temp = n;
        int res=0;
        while(temp!=0){
            int rem = temp%10;
            res+=rem;
            temp/=10;
        }

        return res;
    }

    public static int dp(int num){
        if(num >= 0 && num<=9){
            return num;
        }else{
            return dp(sum(num));
        }
    }

    public int addDigits(int num) {
        return dp(num);
    }
}

class Solution {
    public int addDigits(int num) {
        return num == 0 ? 0 : 1 + (num - 1) % 9;
    }
}