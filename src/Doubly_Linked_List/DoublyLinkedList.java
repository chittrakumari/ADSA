package Doubly_Linked_List;

public class DoublyLinkedList {
    private ListNode head;
    private ListNode tail;
    private int length;
    private class ListNode{
        private int data;
        private ListNode next;
        private ListNode previous;
        public ListNode(int data){
            this.data=data;
        }
    }
    public DoublyLinkedList(){
        this.head=null;
        this.tail=null;
        this.length=0;
    }
    public boolean isEmpty(){
        return length==0; //or head==null;
    }
    public void insertFirst(int value){
        ListNode newNode=new ListNode(value);
        if (isEmpty()) {
            tail=newNode;
        }
        else{
            head.previous=newNode;
        }
        newNode.next=head;
        head=newNode;
        length++;
    }
    public void insertEnd(int value){
        ListNode newNode=new ListNode(value);
        if (isEmpty()) {
            head=newNode;
        }
        else{
           tail.next=newNode;
           newNode.previous=tail;
        }
       tail=newNode;
        length++;

    }
    //traversing forward
    public void traverse(){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
        System.out.println();
    }
    //traversing end
    public void traverseEnd(){
        ListNode temp=tail;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.previous;
        }
        System.out.print("null");
    }


    public static void main(String[] args) {
        DoublyLinkedList dll=new DoublyLinkedList();
        dll.insertFirst(20);
        dll.insertEnd(30);
        dll.traverse();
        dll.traverseEnd();
    }
}
