

/**
 * @author fubibo
 * @create 2021-02-24 11:19
 */

/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需
 * 要合成后的链表满足单调不减规则。
 */
public class Q17 {
    public static void main(String[] args) {

    }

    public static listNode hebingList(listNode head1,listNode head2){
        listNode newhead= new listNode(-1);
        listNode cur=newhead;

        while (head1!=null&&head2!=null) {
            if (head1.value >=head2.value) {
                cur.next = head2;
                head2 = head2.next;
            } else {
                cur.next = head1;
                head1 = head1.next;
            }

            cur=cur.next;
        }

        if (head1!=null){
            cur.next=head1;
        }

        if (head2!=null){
            cur.next=head2;
        }

        return newhead.next;

    }
}
