/*
2299. Strong Password Checker II

A password is said to be strong if it satisfies all the following criteria:

It has at least 8 characters.
It contains at least one lowercase letter.
It contains at least one uppercase letter.
It contains at least one digit.
It contains at least one special character. The special characters are the characters in the following string: "!@#$%^&*()-+".
It does not contain 2 of the same character in adjacent positions (i.e., "aab" violates this condition, but "aba" does not).
Given a string password, return true if it is a strong password. Otherwise, return false.

Example 1:
Input: password = "IloveLe3tcode!"
Output: true
Explanation: The password meets all the requirements. Therefore, we return true.

Example 2:
Input: password = "Me+You--IsMyDream"
Output: false
Explanation: The password does not contain a digit and also contains 2 of the same character in adjacent positions. Therefore, we return false.

Example 3:
Input: password = "1aB!"
Output: false
Explanation: The password does not meet the length requirement. Therefore, we return false.
*/

class Solution {
    public boolean strongPasswordCheckerII(String password) {
        if(password.length()<8) 
            return false;
        String s = "!@#$%^&*()-+";
        boolean digit=false, lowerCase=false,upperCase=false,special=false;
        
        for(int i=0;i<password.length();i++){
            if(i>0 && password.charAt(i)==password.charAt(i-1)) 
                return false;
            if(Character.isDigit(password.charAt(i))) 
                digit=true;
            else if(Character.isLowerCase(password.charAt(i))) 
                lowerCase=true;
            else if(Character.isUpperCase(password.charAt(i))) 
                upperCase=true;
            else{
                char ch = password.charAt(i);
                for(int j=0;j<s.length();j++){
                    if(ch==s.charAt(j)) special=true;
                }
                if(!special) return false;
            }
        }
        return digit && upperCase && lowerCase && special;
    }
}