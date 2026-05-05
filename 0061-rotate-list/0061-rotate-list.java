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
    public ListNode rotateRight(ListNode head, int k) {

        ListNode first=head;
        ListNode left=head;ListNode right=head;
        int size=0;
        while(right!=null){
            size++;
            right=right.next;
        }
        if(size==0)return null;

        k=k%size;
        if(k==0)return head;
        
        right=head;
        int node=0;

        while(node<k){
            node++;
            right=right.next;
        }
        while(right.next!=null){
            left=left.next;
            right=right.next;
        }
        head=left.next;
        left.next=null;
        right.next=first;
        return head;
    }
}