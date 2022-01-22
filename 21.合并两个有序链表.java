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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode dummy=new ListNode();
        ListNode cur=dummy;
        
        ListNode cur1=list1;
        ListNode cur2=list2;
        while(cur1!=null&&cur2!=null){
            if(cur1.val<cur2.val){
                cur.next=cur1;
                cur=cur1;
                cur1=cur1.next;
            }else{
                cur.next=cur2;
                cur=cur2;
                cur2=cur2.next;
            }
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

