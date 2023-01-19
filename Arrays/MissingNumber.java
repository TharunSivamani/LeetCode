/*

268. Missing Number

Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

Example 1:
Input: nums = [3,0,1]
Output: 2

Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

Example 2:
Input: nums = [0,1]
Output: 2

Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.

Example 3:
Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8

Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.

*/

// Solution - 1

class Solution {
    public int missingNumber(int[] nums) {
        int count = 0;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (count == nums[i]) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}

// Solution - 2

class Solution2 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums[0] != 0)
            return 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] > nums[i] + 1) {
                return nums[i] + 1;
            }
        }
        return nums[nums.length - 1] + 1;
    }
}

// Solution - 3

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2;

        for(int i:nums){
            sum-=i;
        }
        return sum;
    }
}