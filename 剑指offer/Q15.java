

/**
 * @author fubibo
 * @create 2021-02-24 11:18
 */

/**
 * 输入一个链表，输出该链表中倒数第k 个结点。
 */
public class Q15 {
    public static void main(String[] args) {

        listNode n1=new listNode(1);
        listNode n2=new listNode(4);
        listNode n3=new listNode(3);
        listNode n4=new listNode(2);
        listNode n5=new listNode(5);
        listNode n6=new listNode(7);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=null;

        System.out.println(daoshukNode(n1,1).value);



    }

    public static listNode daoshukNode(listNode head,int k){
        if (k<=0){
            return null;
        }
        listNode fast=head;
        listNode slow=head;

        for (int i = 1; i < k; i++) {
            fast=fast.next;

        }
        while (fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
}
