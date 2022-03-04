/*
 * @lc app=leetcode.cn id=143 lang=java
 *
 * [143] 重排链表
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
    public void reorderList(ListNode head) {
        
        if(head==null||head.next==null||head.next.next==null){
            return ;
        }
        
        ListNode cur=head;
        ListNode next=cur.next;
        cur.next=getLast(cur);
        cur.next.next=next;
        reorderList(next);
        
    }
    
    public ListNode getLast(ListNode head){
        while(head!=null&&head.next!=null&&head.next.next!=null){
            head=head.next;
        }
        ListNode res=head.next;
        head.next=null;
        return res;
    }
    
    
}
// @lc code=end

