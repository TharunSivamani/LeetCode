/*
448. Find All Numbers Disappeared in an Array

Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.

Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]

Example 2:
Input: nums = [1,1]
Output: [2]
*/

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        List<Integer> list = new ArrayList<>();
        int res[] = new int[nums.length+1];
        
        for(int i:nums){
            res[i] = i;
        }
        
        for(int i=1;i<=nums.length;i++){
            if(res[i] == 0){
                list.add(i);
            }
        }
        
        return list;
    }
}

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        Map<Integer , Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        
        for(int i:nums){
            map.put(i , map.getOrDefault(i , 0)+1);
        }
        
        for(int i=1;i<=nums.length;i++){
            if(map.containsKey(i) == false){
                ans.add(i);
            }
        }
        
        return ans;
        
    }
}