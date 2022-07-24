
/* 
1704. Determine if String Halves Are Alike

You are given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.

Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.

Return true if a and b are alike. Otherwise, return false.

 
Example 1:

Input: s = "book"
Output: true
Explanation: a = "bo" and b = "ok". a has 1 vowel and b has 1 vowel. Therefore, they are alike.

Example 2:

Input: s = "textbook"
Output: false
Explanation: a = "text" and b = "book". a has 1 vowel whereas b has 2. Therefore, they are not alike.
Notice that the vowel o is counted twice.
*/

class Solution {
    public boolean halvesAreAlike(String s) {
        
        ArrayList<Character> list = new ArrayList<Character>();
        String str = s.toLowerCase();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');
        
        int count1 = 0;
        int count2 = 0;
        
        for(int i=0;i<(str.length())/2;i++){
            if(list.contains(str.charAt(i))){
                count1++;
            }
        }
        
        for(int i=(str.length())/2;i<str.length();i++){
            if(list.contains(str.charAt(i))){
                count2++;
            }
        }
        
        if(count1==count2){
            return true;
        }else{
            return false;
        }
        
    }
}
