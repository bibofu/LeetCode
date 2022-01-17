/*
 * @lc app=leetcode.cn id=146 lang=java
 *
 * [146] LRU 缓存机制
 */

// @lc code=start
class LRUCache {

    class Node{
        int key;
        int value;
        Node prev;
        Node next;
        public Node(int key,int value){
            this.key=key;
            this.value=value;
        }
    }

    Node head;
    Node tail;
    Map<Integer,Node> map;
    int size;
    int capacity;



    public LRUCache(int capacity) {
        head=new Node(-1,-1);
        tail=new Node(-1,-1);
        head.next=tail;
        tail.prev=head;
        this.map=new HashMap<>();
        this.size=0;
        this.capacity=capacity;



    }

    public void remove(int key){
        Node node =map.get(key);
        Node prev=node.prev;
        Node next=node.next;

        prev.next=next;
        next.prev=prev;

        map.remove(key);
        size--;
    }

    public void addHead(int key,int value){
        Node node =new Node(key,value);
        Node next=head.next;
        head.next=node;
        node.next=next;
        next.prev=node;
        node.prev=head;

        map.put(key,node);
        size++;

        if(size>capacity){
            Node last=tail.prev;

            remove(last.key);
        }


    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            
            Node node=map.get(key);
            remove(key);
            addHead(key,node.value);
            return node.value;
        }else{
            return -1;
        }

    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            remove(key);
            addHead(key,value);
        }else{
            addHead(key,value);
        }

    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
// @lc code=end

