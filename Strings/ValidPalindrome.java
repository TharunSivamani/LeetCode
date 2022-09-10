/* 
125. Valid Palindrome

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

Example 3:
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
*/

class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < s.length(); i++)
            if(Character.isAlphabetic(s.charAt(i)) || Character.isDigit(s.charAt(i)))
                sb.append(Character.toLowerCase(s.charAt(i)));

        String t = sb.toString();
        return t.equals(sb.reverse().toString());
    }
}


// Solution 2

class Solution2 {
    public boolean isPalindrome(String s) {
          String a = s.toLowerCase();
        String b ="";
        for(int i =0;i<a.length();i++){
            if(a.charAt(i)==' '){

            }
           else if((a.charAt(i)>='a'&& a.charAt(i)<='z') || (a.charAt(i)>='0'&& a.charAt(i)<='9')){
                b+=a.charAt(i);
            }
        }
        String c =reverse(b);
        if(b.equals(c)){
            return true;
        }
        return false;
    }
	
    public static String reverse(String a){
        String abs ="";

        for(int i=a.length()-1;i>=0;i--){
            abs+=a.charAt(i);
        }
        return abs;
    }
}
