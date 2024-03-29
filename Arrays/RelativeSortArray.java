/*
1122. Relative Sort Array

Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.

Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2. Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.

Example 1:
Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
Output: [2,2,2,1,4,3,3,9,6,7,19]

Example 2:
Input: arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
Output: [22,28,8,6,17,44]
*/

class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] res = new int[arr1.length];
        int ind=0;

        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr2[i] == arr1[j]){
                    list.add(arr1[j]);
                    arr1[j] = -1;
                }
            }
        }

        Arrays.sort(arr1);

        for(int i:arr1){
            if(i != -1){
                list.add(i);
            }
        }

        for(int i:list){
            res[ind++] = i;
        }
        

        return res;
        
    }
}