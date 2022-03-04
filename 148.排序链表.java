/*
 * @lc app=leetcode.cn id=148 lang=java
 *
 * [148] 排序链表
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
    public ListNode sortList(ListNode head) {

        if(head==null||head.next==null){
            return head;
        }

        ListNode mid=getMid(head);
        ListNode right=mid.next;
        mid.next=null;
        ListNode a=sortList(head);
        ListNode b=sortList(right);

        return merge(a,b);
    }

    public ListNode getMid(ListNode head){
        if(head==null||head.next==null){
            return head;
        }

        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    public ListNode merge(ListNode node1,ListNode node2){

        ListNode dummy=new ListNode(-1);
        ListNode cur=dummy;
        while(node1!=null&&node2!=null){
            if(node1.val<=node2.val){
                cur.next=node1;
                node1=node1.next;
            }else{
                cur.next=node2;
                node2=node2.next;
            }
            cur=cur.next;
        }

        if(node1!=null){
            cur.next=node1;
        }
        if(node2!=null){
            cur.next=node2;
        }
        
        return dummy.next;
    }

   
}
// @lc code=end

