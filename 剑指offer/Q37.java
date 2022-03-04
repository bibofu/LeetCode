package jianzhiOffer;

/**
 * @author fubibo
 * @create 2021-02-28 17:42
 */



/**
 * 输入两个链表，找出它们的第一个公共结点。
 */
public class Q37 {
    public static void main(String[] args) {
        listNode n1=new listNode(1);
        listNode n2=new listNode(3);
        listNode n3=new listNode(2);
        listNode n4=new listNode(4);
        listNode n5=new listNode(7);



        listNode n6=new listNode(8);
        listNode n7=new listNode(6);

        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;

        n6.next=n7;
        n7.next=n4;

        System.out.println(findTwoList(n1,n6));


    }
    public static listNode findTwoList(listNode headA, listNode headB){

        listNode pa=headA;
        listNode pb=headB;
        while (pa!=pb) {
            if (pa!=null){
                pa=pa.next;
            }else{
                pa=headB;
            }

            if (pb!=null){
                pb=pb.next;
            }else{
                pb=headA;
            }


        }




        return pa;
    }
}
