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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode newListNodeHeadPointer = new ListNode(0);
        ListNode currentNode = newListNodeHeadPointer;
        int carry = 0;
        
        ListNode nodeOne = l1;
        ListNode nodeTwo = l2;
        
        while (nodeOne != null || nodeTwo != null || carry != 0) {
            int valueOne = (nodeOne != null) ? nodeOne.val : 0;
            int valueTwo = (nodeTwo != null) ? nodeTwo.val : 0;
            
            int sumOfValues = valueOne + valueTwo + carry;
            
            int newValue = sumOfValues % 10;
            ListNode newNode = new ListNode(newValue);
            currentNode.next = newNode;
            currentNode = newNode;
            
            carry = sumOfValues / 10;
            nodeOne = (nodeOne != null) ? nodeOne.next : null;
            nodeTwo = (nodeTwo != null) ? nodeTwo.next : null;
        }
        return newListNodeHeadPointer.next;
    }
}