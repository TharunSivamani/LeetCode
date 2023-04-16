/*
19. Remove Nth Node From End of List

Given the head of a linked list, remove the nth node from the end of the list and return its head.

Example 1:
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]

Example 2:
Input: head = [1], n = 1
Output: []

Example 3:d
Input: head = [1,2], n = 1
Output: [1]
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */


class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode temp = head;

        int count = 0;

        while(temp!= null){
            count++;
            temp = temp.next;
        }

        int resInd = count - n;

        if(resInd == 0){
            head = head.next;
        }else{
            int res = resInd - 1;
            ListNode prev = head;
            while(res != 0){
                prev = prev.next;
                res--;
            }

            prev.next = prev.next.next;
        }

        return head;

    }

}

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode temp = head;

        int count = 0;

        while(temp!= null){
            count++;
            temp = temp.next;
        }

        if(count == n){
            head = head.next;
            return head;
        }

        int resInd = count-n;
        int res = 1;
        ListNode tmp = head;

        while(res++<resInd){
            tmp = tmp.next;
        }tmp.next = tmp.next.next;

        return head;
        
    }
}