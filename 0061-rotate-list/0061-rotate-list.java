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

        ListNode first=head;//for updating last node next var to the first node
        
        //these 2 vars for maintaining k node between left and right
        ListNode left=head;ListNode right=head;

        //calculate size of the list 
        int size=0;
        while(right!=null){
            size++;
            right=right.next;
        }

        if(size==0)return null;

        k=k%size; //if k is greater than its size ,after rotation we will get the repeated list same as for some k less than its size 
        if(k==0)return head; //if k is zero it means no rotation needed ,just return head

        right=head;
        int node=0;

        //move right pointer to the kth node 
        while(node<k){
            node++;
            right=right.next;
        }
        //once right is at kth node then start moving each left and right pointer until the list doesnot get end
        while(right.next!=null){
            left=left.next;
            right=right.next;
        }

        //just update references
        head=left.next;
        left.next=null;
        right.next=first;


        return head;
    }
}