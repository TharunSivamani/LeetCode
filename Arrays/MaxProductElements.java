/* 
1464. Maximum Product of Two Elements in an Array

Given the array of integers nums, you will choose two different indices i and j of that array. Return the maximum value of (nums[i]-1)*(nums[j]-1).
 
Example 1:

Input: nums = [3,4,5,2]
Output: 12 
Explanation: If you choose the indices i=1 and j=2 (indexed from 0), you will get the maximum value, that is, (nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12. 
Example 2:

Input: nums = [1,5,4,5]
Output: 16
Explanation: Choosing the indices i=1 and j=3 (indexed from 0), you will get the maximum value of (5-1)*(5-1) = 16.
Example 3:

Input: nums = [3,7]
Output: 12
*/

// Solution 1
import java.util.Arrays;
class Solution {
    public int maxProduct(int[] nums) {
        
        Arrays.sort(nums);
        int n = nums.length;
        int i = nums[n-1]-1;
        int j = nums[n-2]-1;
        
        return (i*j);
        
    }
}

// Solution 2

class Solution2 {
    public int maxProduct(int[] nums) {
        
        int n = nums.length;
        int max = 0;
        int res=0;
        
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(((nums[i]-1)*(nums[j]-1))>max){
                    res = ((nums[i]-1)*(nums[j]-1));

                }
                
                max = Math.max(max,res);
            }
        }
        
        return max;
    }
}