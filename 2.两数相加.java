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
        
        ListNode res=new ListNode();
        ListNode cur=res;
        
        ListNode cur1=l1;
        ListNode cur2=l2;
        int carry=0;//表示进位
        int temp;
        int value;
        while(cur1!=null&&cur2!=null){
            temp=cur1.val+cur2.val+carry;
            cur1=cur1.next;
            cur2=cur2.next;
            
            carry=temp/10;
            value=temp%10;
            
            cur.next=new ListNode(value);
            cur=cur.next;
            
        }
        
        while(cur1!=null){
            temp=cur1.val+carry;
            cur1=cur1.next;
            
            carry=temp/10;
            value=temp%10;
            
            cur.next=new ListNode(value);
            cur=cur.next;
        }
        while(cur2!=null){
            temp=cur2.val+carry;
            cur2=cur2.next;
            
            carry=temp/10;
            value=temp%10;
            cur.next=new ListNode(value);
            cur=cur.next;
        }
        
        if(carry==1){
            cur.next=new ListNode(1);
        }
        
        return res.next;

    }
}
// @lc code=end

