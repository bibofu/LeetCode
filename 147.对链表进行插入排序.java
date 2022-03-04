/*
 * @lc app=leetcode.cn id=147 lang=java
 *
 * [147] 对链表进行插入排序
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
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = head;
        ListNode prev = null;
        ListNode temp = null;
        while(cur != null && cur.next != null){
            if(cur.val <= cur.next.val){
                cur = cur.next;
            } else {
                temp = cur.next;
                cur.next = cur.next.next;
                prev = dummy;
                while(prev.next.val <= temp.val){
                    prev = prev.next;
                }

                temp.next = prev.next;
                prev.next = temp;
            }
        }

        //dummy 3 5 4

        return dummy.next;
    }
}
// @lc code=end

