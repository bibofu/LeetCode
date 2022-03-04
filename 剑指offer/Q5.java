package jianzhiOffer;

/**
 * @author fubibo
 * @create 2021-02-23 16:38
 */

/**
 * 输入一个链表，从尾到头打印链表每个节点的值。
 */

class Node{
    public int value;
    public Node(int value){
        this.value=value;
    }
    public Node next;

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}

public class Q5 {
    public static void main(String[] args) {
        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(3);
        Node n4=new Node(4);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=null;

        System.out.println(revNode(n1));



    }
    public static Node revNode(Node head){
        Node pre=null;
        Node cur=head;
        while (cur!=null){
            Node next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return pre;
    }
}
