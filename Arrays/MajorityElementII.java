/*
229. Majority Element II

Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

Example 1:
Input: nums = [3,2,3]
Output: [3]

Example 2:
Input: nums = [1]
Output: [1]

Example 3:
Input: nums = [1,2]
Output: [1,2]
*/

import java.util.*;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        Arrays.sort(nums);
        
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            int count = 1;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j] && i!=j){
                    count++;
                }
            }
            
            if(count > (nums.length/3)){
                set.add(nums[i]);
            }
        }
        
        for(int i:set){
            list.add(i);
        }
        
        return list;
        
    }
}