/*
 * @lc app=leetcode.cn id=23 lang=java
 *
 * [23] 合并 K 个升序链表
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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> q = new PriorityQueue<>((o1,o2)->o1.val-o2.val);
        for(ListNode node:lists){
            while(node!=null){
                q.offer(node);
                node = node.next;
            }
        }

        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        while(!q.isEmpty()){
            cur.next = q.poll();
            cur = cur.next;
            if(q.isEmpty()){
                cur.next = null;
            }
        }

        return dummy.next;
    }
}
// @lc code=end

