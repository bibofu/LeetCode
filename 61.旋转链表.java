/*
 * @lc app=leetcode.cn id=61 lang=java
 *
 * [61] 旋转链表
 */

// @lc code=start
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
        if(head==null){
            return head;
        }   
        
        int n=1;
        
        ListNode tail=head;
        while(tail!=null&&tail.next!=null){
            n++;
            tail=tail.next;
        }
        k=k%n;
        
        if(k==0){
            return head;
        }
        
        ListNode pre=head;
        
        for(int i=1;i<n-k;i++){
            pre=pre.next;
        }
        
        ListNode next=pre.next;
        pre.next=null;
        tail.next=head;
        
        return next;
        
    }
}
// @lc code=end

