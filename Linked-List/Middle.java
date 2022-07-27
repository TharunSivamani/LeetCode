/* 
876. Middle of the Linked List

Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.

Example 1:

Input: head = [1,2,3,4,5]
Output: [3,4,5]
Explanation: The middle node of the list is node 3.

Example 2:

Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one
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
    public ListNode middleNode(ListNode head) {
        
        // Checking if the head is empty
        if(head == null){
            return head;
        }
        
        int count = 0;
        
        ListNode temp = head;
        
        while(temp != null){
            count++;
            temp = temp.next;
        }
        
        count = (count/2) + 1; // general case formula
        
        while(count>1){
            head = head.next;
            count--; // traversing to the middle element from the original node
        }
        return head;       
    }
}