/*
2443. Sum of Number and Its Reverse

Given a non-negative integer num, return true if num can be expressed as the sum of any non-negative integer and its reverse, or false otherwise.

Example 1:
Input: num = 443
Output: true
Explanation: 172 + 271 = 443 so we return true.

Example 2:
Input: num = 63
Output: false
Explanation: 63 cannot be expressed as the sum of a non-negative integer and its reverse so we return false.

Example 3:
Input: num = 181
Output: true
Explanation: 140 + 041 = 181 so we return true. Note that when a number is reversed, there may be leading zeros.
*/

class Solution {
    
    public static int reverse(int num){
        int temp = num;
        int sum=0;
        while(temp!=0){
            int rem = temp%10;
            sum = sum*10+rem;
            temp/=10;
        }

        return sum;
    }

    public boolean sumOfNumberAndReverse(int num) {

        for(int i=0;i<=num;i++){
            int rev = reverse(i);

            if(i+rev == num){
                return true;
            }
        }

        return false;
        
    }
}

class Solution {
    public boolean sumOfNumberAndReverse(int num) {

        for(int i=0;i<=num;i++){
            int n = i;
            int r = 0;

            while(n!=0){
                int rem = n%10;
                r = r*10+rem;
                n/=10;
            }

            if(r+i == num){
                return true;
            }
        }

        return false;
        
    }
}