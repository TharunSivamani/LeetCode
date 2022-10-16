/* 
1287. Element Appearing More Than 25% In Sorted Array

Given an integer array sorted in non-decreasing order, there is exactly one integer in the array that occurs more than 25% of the time, return that integer.

Example 1:
Input: arr = [1,2,2,6,6,6,6,7,10]
Output: 6

Example 2:
Input: arr = [1,1]
Output: 1
*/

class Solution {
    public int findSpecialInteger(int[] arr) {
        
        Map<Integer , Integer> map = new HashMap<>();
        int count = arr.length/4;
        
        for(int i:arr){
            map.put(i,map.getOrDefault(i , 0)+1);
            
            if(map.get(i) > count){
                return i;
            }
        }
        
        return 0;
        
    }
}