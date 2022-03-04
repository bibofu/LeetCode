package jianzhiOffer;

/**
 * @author fubibo
 * @create 2021-02-28 17:37
 */

/**
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向
 * 下一个节点，另一个特殊指针指向任意一个节点），返回结果为复制后复杂链表的
 * head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接
 * 返回空）
 */

class RandomListNode{
    int label;
    RandomListNode next;
    RandomListNode random;
    public RandomListNode(int label){
        this.label=label;
    }
}
public class Q26 {
    public static void main(String[] args) {

    }

    public RandomListNode Clone2(RandomListNode pHead) {
        if(pHead == null)
            return null;
        RandomListNode head = new RandomListNode(pHead.label) ;
        RandomListNode temp = head ;
        while(pHead.next != null) {
            temp.next = new RandomListNode(pHead.next.label) ;
            if(pHead.random != null) {
                temp.random = new RandomListNode(pHead.random.label) ;
            }pHead = pHead.next ;
            temp = temp.next ;
        }
        return head ;
    }
}
