/*
204. Count Primes

Given an integer n, return the number of prime numbers that are strictly less than n.

Example 1:
Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.

Example 2:
Input: n = 0
Output: 0

Example 3:
Input: n = 1
Output: 0
*/

class Solution {
    
    private static void sieve(int n,ArrayList<Integer> list){

        boolean prime[] = new boolean[n+1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;

        for (int p = 2; p * p < n; p++) {
            if (prime[p] == true) {
                for (int i = p * p; i < n; i += p)
                    prime[i] = false;
            }
        }

        for (int i = 2; i < n; i++) {
            if (prime[i] == true)
                list.add(i);
        }

    }

    public int countPrimes(int n) {
        if(n<2) return 0;
        ArrayList<Integer> list = new ArrayList<>();

        sieve(n,list);
        

        return list.size();
    }
}