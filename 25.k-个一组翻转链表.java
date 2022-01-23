/*
 * @lc app=leetcode.cn id=25 lang=java
 *
 * [25] K 个一组翻转链表
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
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode cur=head;
        for(int i=0;i<k;i++){
            if(cur==null){
                return head;
            }
            cur=cur.next;
        }
        
        ListNode newhead=reverseK(head,cur);
        head.next=reverseKGroup(cur,k);
        
        return newhead;

    
    
    }
    
    public ListNode reverseK(ListNode begin,ListNode end){
        ListNode pre=null;
        ListNode cur=begin;
        while(cur!=end){
            ListNode next=cur.next;
            cur.next=pre;
            
            pre=cur;
            cur=next;
        }
        
        return pre;
        
        
    }
}
// @lc code=end

