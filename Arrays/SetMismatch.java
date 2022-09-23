/*
645. Set Mismatch

You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

Example 1:
Input: nums = [1,2,2,4]
Output: [2,3]

Example 2:
Input: nums = [1,1]
Output: [1,2]
*/

class Solution {
    public int[] findErrorNums(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        int n = nums.length;
        int actualSum = 0;
        int dup = 0;
        
        for(int i:nums){
            if(!set.contains(i)){
                actualSum += i;
            }else{
                dup = i;
            }
            
            set.add(i);
        }
        
        int expectedSum = (1 + n) * n / 2;
        int missingNo = expectedSum - actualSum;
        
        return new int[]{dup , missingNo};
    }
}

class Solution {
    public int[] findErrorNums(int[] nums) {
        
        Map<Integer , Integer> map = new HashMap<>();
        
        for(int i:nums){
            map.put(i , map.getOrDefault(i,0)+1);
        }
        
        int missing = 0;
        int duplicate = 0;
        
        for(int i=1;i<=nums.length;i++){
            if(map.containsKey(i) == false){
                missing = i;
            }else if(map.get(i) == 2){
                duplicate = i;
            }
            
            if(duplicate > 0 && missing > 0){
                break;
            }
        }
        
        return new int[]{duplicate , missing};
        
    }
}