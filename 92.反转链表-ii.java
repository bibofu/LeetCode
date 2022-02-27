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
        
        ListNode cur=dummy;
        ListNode pre=null;
        ListNode newpre=null;
        ListNode newend=null;
        ListNode end=null;
        
        //-1 1 2 3 4 5
        for(int i=0;i<=right;i++){
            if(i==left-1){
                pre=cur;
                newpre=cur.next;
            }else if(i==right){
                end=cur;
                newend=cur.next;
            }
            cur=cur.next;
        }
        
        ListNode pre2=null;
        ListNode cur2=newpre;
        while(cur2!=null&&cur2!=newend){
            ListNode next=cur2.next;
            cur2.next=pre2;
            pre2=cur2;
            cur2=next;
        }
        
        pre.next=end;
        newpre.next=newend;
        
        return dummy.next;

    }
}
// @lc code=end

