/*
 * @lc app=leetcode.cn id=328 lang=java
 *
 * [328] 奇偶链表
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
    public ListNode oddEvenList(ListNode head) {
        
        if(head==null||head.next==null){
            return head;
        }
        ListNode head1=head;
        ListNode head2=head.next;
        ListNode cur1=head1;
        ListNode cur2=head2;
        
        
        while(cur2!=null&&cur2.next!=null){
            ListNode next=cur2.next;
            cur1.next=next;
            cur2.next=next.next;
            
            cur1=cur1.next;
            cur2=cur2.next;
        }
        
        cur1.next=head2;
        
        return head1;

    }
}
// @lc code=end

