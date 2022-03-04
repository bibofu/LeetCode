

/**
 * @author fubibo
 * @create 2021-02-24 11:16
 */

/**
 * 给定单向链表的头指针和一个节点指针，在O(1)时间复杂度内删除该
 * 节点。
 */

class listNode{
    int value;
    public listNode(int value){
        this.value=value;
    }
    listNode next;

    @Override
    public String toString() {
        return "listNode{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
public class Q13 {
    public static void main(String[] args) {

    }

    public static void delListNode(listNode head,listNode del){
        if (head==null||del==null){
            return;
        }

        if (del==head){
            head=head.next;
        }

        if (del.next!=null){
            del.value=del.next.value;
            del.next=del.next.next;
        }else {
            listNode temp=head;
            while (temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
        }

    }
}
