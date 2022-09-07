/* 
728. Self Dividing Numbers

A self-dividing number is a number that is divisible by every digit it contains.

For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
A self-dividing number is not allowed to contain the digit zero.

Given two integers left and right, return a list of all the self-dividing numbers in the range [left, right].

Example 1:
Input: left = 1, right = 22
Output: [1,2,3,4,5,6,7,8,9,11,12,15,22]

Example 2:
Input: left = 47, right = 85
Output: [48,55,66,77]
*/

import java.util.*;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=left;i<=right;i++){
            if(isSelfDivide(i)){
                list.add(i);
            }
        }
        
        return list;
    }
    
    public boolean isSelfDivide(int x){
        int temp = x;
        while(x!=0){
            int rem = x % 10;
            if(rem == 0 || temp % rem != 0){
                return false;
            }
            
            x /= 10;
        }
        return true;
    }
}

class Solution2 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=left;i<=right;i++){
            if(isSelfDivide(i)){
                list.add(i);
            }
        }
        
        return list;
    }
    
    public boolean isSelfDivide(int n){
        for(char c : String.valueOf(n).toCharArray()){
            if(c == '0' || n % (Character.getNumericValue(c)) > 0){
                return false;
            }
            
        }
        return true;
    }
    
}