/*
 * @lc app=leetcode.cn id=82 lang=java
 *
 * [82] 删除排序链表中的重复元素 II
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
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode cur=dummy;
        
        while(cur!=null&&cur.next!=null&&cur.next.next!=null){
            if(cur.next.val==cur.next.next.val){
                ListNode temp=cur.next.next;
                while(temp!=null&&temp.val==cur.next.val){
                    temp=temp.next;
                }
                cur.next=temp;
            }else{
                cur=cur.next;
            }
        }
        
        return dummy.next;

    }
}
// @lc code=end

