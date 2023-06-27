/*
2231. Largest Number After Digit Swaps by Parity

You are given a positive integer num. You may swap any two digits of num that have the same parity (i.e. both odd digits or both even digits).

Return the largest possible value of num after any number of swaps.

Example 1:
Input: num = 1234
Output: 3412
Explanation: Swap the digit 3 with the digit 1, this results in the number 3214.
Swap the digit 2 with the digit 4, this results in the number 3412.
Note that there may be other sequences of swaps but it can be shown that 3412 is the largest possible number.
Also note that we may not swap the digit 4 with the digit 1 since they are of different parities.

Example 2:
Input: num = 65875
Output: 87655
Explanation: Swap the digit 8 with the digit 6, this results in the number 85675.
Swap the first digit 5 with the digit 7, this results in the number 87655.
Note that there may be other sequences of swaps but it can be shown that 87655 is the largest possible number.
*/

class Solution {
    public int largestInteger(int num) {

        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        String s = String.valueOf(num);
        
        for(char c:s.toCharArray()){
            int n = Character.getNumericValue(c);

            if(n%2==0){
                even.add(n);
            }else{
                odd.add(n);
            }
        }

        Collections.sort(even,Collections.reverseOrder());
        Collections.sort(odd,Collections.reverseOrder());

        int evenIdx = 0;
        int oddIdx = 0;

        String res = "";

        for(int i=0;i<s.length();i++){
            int n = Character.getNumericValue(s.charAt(i));
            if(n%2==0){
                res+=even.get(evenIdx++);
            }else{
                res+=odd.get(oddIdx++);
            }
        }

        return Integer.parseInt(res);
    }
}