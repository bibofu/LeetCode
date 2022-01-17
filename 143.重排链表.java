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
        ListNode pre=null;
        while(cur!=null&&cur.next!=null){
            pre=cur;
            cur=cur.next;
        }

        ListNode next=head.next;

        pre.next=null;
        head.next=cur;
        cur.next=next;
        reorderList(next);

        




       

    }
}
// @lc code=end

