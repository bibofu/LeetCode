#
# @lc app=leetcode.cn id=2 lang=python3
#
# [2] 两数相加
#

# @lc code=start
# Definition for singly-linked list.
class ListNode:
     def __init__(self, val=0, next=None):
         self.val = val
         self.next = next
from multiprocessing import dummy


class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        dummy=ListNode()
        cur=dummy
        carry=0
        while l1 or l2 or carry:
            v1=l1.val if l1 else 0
            v2=l2.val if l2 else 0
            val=v1+v1+carry

            carry=val//10
            cur.next=ListNode(val%10)

            cur=cur.next
            l1=l1.next if l1 else None
            l2=l2.next if l2 else None
        
        return dummy.next

# @lc code=end

