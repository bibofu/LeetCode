/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        int carry = 0;
        while(l1!=null&&l2!=null){
            int val = (l1.val+l2.val+carry)%10;
            carry = (l1.val+l2.val+carry)/10;
            cur.next = new ListNode(val);
            cur = cur.next;
            l1=l1.next;
            l2=l2.next;
        }

        while(l1!=null){
            int val = (l1.val+carry)%10;
            carry = (l1.val+carry)/10;
            cur.next = new ListNode(val);
            cur = cur.next;
            l1=l1.next;
        }

         while(l2!=null){
            int val = (l2.val+carry)%10;
            carry = (l2.val+carry)/10;
            cur.next = new ListNode(val);
            cur = cur.next;
            l2=l2.next;
        }

        if(carry == 1){
            cur.next = new ListNode(1);
        }

        return dummy.next;

    }
}
// @lc code=end

