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
// class Solution {
//     public void reorderList(ListNode head) {
//         if(head == null && head.next == null && head.next.next == null){
//             return;
//         }
//         slow = slow.next;
//         fast = fast.next;
//     }
//     while(fast.next!= null && fast.next.next!= null){
//         slow = slow.next;
//         fast = fast.next.next;
//         ListNode  prev = null;
//         ListNode curr = pprev;
//         while(curr!= null){
//             ListNode nextNode = curr;
//             curr.next = prev;
//             prev = curr;
//             curr = nextNode;
//         }
//         ListNode t1 = head;
//         ListNode t2 = prev;
//         while(t2!=null){
//             ListNode m1 = t1.next;
//             ListNode m2 = t2.next;
//             t1.next = t2;
//             t2.next = m1;
//             t1 = m1;
//             t2 = m2;
//         }
//     }

// }

class Solution {
    public void reorderList(ListNode head) {

        // Step 1: Check base condition
        if (head == null || head.next == null) {
            return;
        }

        // Step 2: Find middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 3: Separate second half
        ListNode second = slow.next;
        slow.next = null;

        // Step 4: Reverse second half
        ListNode prev = null;
        ListNode curr = second;

        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        // Step 5: Merge both halves
        ListNode t1 = head;
        ListNode t2 = prev;

        while (t2 != null) {
            ListNode m1 = t1.next;
            ListNode m2 = t2.next;

            t1.next = t2;
            t2.next = m1;

            t1 = m1;
            t2 = m2;
        }
    }
}
