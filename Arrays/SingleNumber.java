/* 
136. Single Number

Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:
Input: nums = [2,2,1]
Output: 1

Example 2:
Input: nums = [4,1,2,1,2]
Output: 4

Example 3:
Input: nums = [1]
Output: 1
*/

import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
        
        HashMap<Integer , Integer> map = new HashMap<>();
        
        for(int i:nums){
            map.put(i , map.getOrDefault(i , 0)+1);
        }
        int ans = 0;
        for(int i:nums){
            if(map.get(i) == 1){
                ans = i;
            }
        }
        
        return ans;
        
    }
}

// Solution 2

class Solution2 {
    public int singleNumber(int[] nums) {
        
        int x = nums[0];
        
        for(int i = 1; i < nums.length; i++){
            x = x ^ nums[i];
        }
        
        return x;
        
    }
}