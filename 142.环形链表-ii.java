/*
 * @lc app=leetcode.cn id=142 lang=java
 *
 * [142] 环形链表 II
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null||head.next==null){
            return null;
        }
        ListNode fast=head;
        ListNode slow=head;
        boolean flag=false;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                flag=true;
                break;
            }
        }
        if(!flag){
            return null;
        }
        slow=head;
        while(slow!=fast){
            slow=slow.next;
            fast=fast.next;
        }
        
        return slow;
    }
}
// @lc code=end

