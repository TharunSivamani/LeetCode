/*
1337. The K Weakest Rows in a Matrix

You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians). The soldiers are positioned in front of the civilians. That is, all the 1's will appear to the left of all the 0's in each row.

A row i is weaker than a row j if one of the following is true:

The number of soldiers in row i is less than the number of soldiers in row j.
Both rows have the same number of soldiers and i < j.
Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.

Example 1:
Input: mat = 
[[1,1,0,0,0],
 [1,1,1,1,0],
 [1,0,0,0,0],
 [1,1,0,0,0],
 [1,1,1,1,1]], 
k = 3
Output: [2,0,3]
Explanation: 
The number of soldiers in each row is: 
- Row 0: 2 
- Row 1: 4 
- Row 2: 1 
- Row 3: 2 
- Row 4: 5 
The rows ordered from weakest to strongest are [2,0,3,1,4].

Example 2:
Input: mat = 
[[1,0,0,0],
 [1,1,1,1],
 [1,0,0,0],
 [1,0,0,0]], 
k = 2
Output: [0,2]
Explanation: 
The number of soldiers in each row is: 
- Row 0: 1 
- Row 1: 4 
- Row 2: 1 
- Row 3: 1 
The rows ordered from weakest to strongest are [0,2,3,1].
*/

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        
        int n = mat.length;
        int a[] = new int[n];
        int b[] = new int[n];        
        
        for(int i=0;i<n;i++){
            a[i] = i;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j] == 1){
                    b[i] += 1;
                }
            }
        }
        
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(b[j] > b[j+1]){
                    int temp = b[j];
                    b[j] = b[j+1];
                    b[j+1] = temp;
                    
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }else if(b[j] == b[j+1] && a[j] > a[j+1]){
                    int temp = b[j];
                    b[j] = b[j+1];
                    b[j+1] = temp;
                    
                    int t = a[j];
                    a[j] = a[j+1];
                    a[j+1] = t;
                }
            }
        }
        
        int res[] = new int[k];
        
        for(int i=0;i<k;i++){
            res[i] = a[i];
        }
        
        return res;
        
    }
}