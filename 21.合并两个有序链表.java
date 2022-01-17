/*
 * @lc app=leetcode.cn id=21 lang=java
 *
 * [21] 合并两个有序链表
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode cur1=l1;
        ListNode cur2=l2;

        ListNode dummy=new ListNode(-1);
        ListNode cur=dummy;

        while(cur1!=null&&cur2!=null){
            if(cur1.val<cur2.val){
                cur.next=cur1;
                cur1=cur1.next;
            }else{
                cur.next=cur2;
                cur2=cur2.next;
            }
            cur=cur.next;

        }

        if(cur1!=null){
            cur.next=cur1;
        }

        if(cur2!=null){
            cur.next=cur2;
        }
        return dummy.next;

    }
}
// @lc code=end

