/*
 * @lc app=leetcode.cn id=92 lang=java
 *
 * [92] 反转链表 II
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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode dummy=new ListNode(-1);
        dummy.next=head;

        ListNode pre1=dummy;
        ListNode cur1=head;
        for(int i=1;i<left;i++){
            pre1=cur1;
            cur1=cur1.next;
        }

        ListNode cur2=head;
        for(int i=1;i<right;i++){
            cur2=cur2.next;
        }

        ListNode next=cur2.next;

        pre1.next=rever(cur1,cur2);
        cur1.next=next;
        return dummy.next;





    }

    public ListNode rever(ListNode a,ListNode b){
        ListNode pre=null;
        ListNode cur=a;
        while(cur!=b){
            ListNode next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }

        cur.next=pre;

        return cur;
    }
}
// @lc code=end

