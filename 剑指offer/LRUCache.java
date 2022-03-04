package jianzhiOffer;

/**
 * @author fubibo
 * @create 2021-03-03 23:07
 */

/**
 * 自定义一个LRU缓存(链表实现)
 */
class LRUNode{
    String key;
    Object value;
    LRUNode next;
    public LRUNode(String key,Object value){
        this.key=key;
        this.value=value;
    }
}
public class LRUCache {
    LRUNode head;
    int size=0;
    int capacity=0;
    public LRUCache(int capacity){
        this.capacity=capacity;
    }

    public void put(String key,Object value){
        if (capacity==1){
            head=new LRUNode(key,value);
        }

        if (head==null){
            head=new LRUNode(key,value);
        }

        if (head.key.equals(key)){
            return;
        }
        LRUNode cur=head;
        LRUNode pre=head;

        cur=cur.next;

        while (cur!=null){
            if (cur.key.equals(key)){
                break;
            }
            pre=cur;
            cur=cur.next;
        }

        if (cur!=null){
            cur.value=value;
            pre.next=cur.next;
            cur.next=head;
            head=cur;
        }else {
            LRUNode tmp=new LRUNode(key,value);

            if (size>=capacity){
                cur=head;
                while (cur.next!=null&&cur.next.next!=null){
                    cur=cur.next;
                }
                cur.next=null;
            }
            tmp.next=head;
            head=tmp;
        }



    }

    public Object get(String key){
        LRUNode cur=head;
        LRUNode pre=head;
        if (head==null){
            return null;
        }

        if (head.key.equals(key)){
            return cur.value;
        }

        cur=cur.next;
        while (cur!=null){
            if (cur.key.equals(key)){
                break;
            }
            pre=cur;
            cur=cur.next;
        }

        if (cur==null){
            return null;
        }

        pre.next=cur.next;
        cur.next=head;
        head=cur;

        return cur.value;
    }
}
