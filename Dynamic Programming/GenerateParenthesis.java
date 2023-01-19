/* 
22. Generate Parentheses

Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

Example 1:
Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]

Example 2:
Input: n = 1
Output: ["()"]
*/

class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> list = new ArrayList<>();

        backtrack(list,"",0,0,n);

        return list;
        
    }

    private static void backtrack(List<String> list , String current_string , int open , int close , int max){
        if(current_string.length() == max*2){
            list.add(current_string);
            return;
        }

        if(open < max){
            backtrack(list , current_string+'(',open+1,close,max);
        }

        if(close<open){
            backtrack(list,current_string+')',open,close+1,max);
        }
    }
}