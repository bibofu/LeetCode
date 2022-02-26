/*
 * @lc app=leetcode.cn id=86 lang=java
 *
 * [86] 分隔链表
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
    public ListNode partition(ListNode head, int x) {
        
        if(head==null||head.next==null){
            return head;
        }
        
        ListNode left=new ListNode(-1);
        ListNode leftcur=left;
        ListNode right=new ListNode(-1);
        ListNode rightcur=right;
        
        while(head!=null){
            if(head.val<x){
                leftcur.next=head;
                leftcur=leftcur.next;
                
            }else{
                rightcur.next=head;
                rightcur=rightcur.next;
            }
            
            head=head.next;
        }
        rightcur.next=null;
        
        leftcur.next=right.next;
        
        return left.next;

    }
}
// @lc code=end

