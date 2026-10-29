/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
    //     ListNode Node = head;
    //     while(node != null && Node.next != null){
    //         if(Node.val == val){
    //             Node.next = Node.next.next;
    //         }
    //         else{
    //             Node = Node.next;
    //         }
    //     }
    //     if(head != null && head.val != null){
    //         head = head.next;
    //     }
    //     return head;
       node.val = node.next.val;
node.next = node.next.next;
    }
}