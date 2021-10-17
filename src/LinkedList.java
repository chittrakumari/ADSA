public class LinkedList{


    private class ListNode{
        int data;
        ListNode next;
        ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    ListNode head=null;
    private ListNode insertFirst(int data){
        ListNode new_Node=new ListNode(data);
        new_Node.next=head;
        head=new_Node;
        return head;
    }
    private ListNode insertLast(int data){
        ListNode new_node=new ListNode(data);
        if(head==null){
            head=new_node;
            return new_node;
        }
        ListNode current=head;

        while(current.next!=null){
            current=current.next;
        }
        current.next=new_node;
        return head;
    }

    private void display(){
        ListNode current=head;
        while(current!=null)
        {
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.print("null");
        System.out.println();
    }

    private ListNode deleteFirst(){
        ListNode temp=head;
        head=head.next;
        temp.next=null;
        return head;
    }
    private ListNode insertAtGivenPositionInALinkedlist(int data,int position){
        ListNode node=new ListNode(data);
        ListNode current=head;
        if(position==1){
            node.next=head;
            head=node;
            return head;
        }
        for(int i=1;i<position-1;i++){
            current=current.next;
        }
        ListNode temp=current;
        node.next=current.next;
        temp.next=node;
        return head;

    }
    private ListNode deleteAtGivenPositionInALinkedlist(int position){
        ListNode current=head;
        if(position==1){
            head=head.next;
            return head;
        }
        for(int i=1;i<position-1;i++){
            current=current.next;
        }
        current.next=current.next.next;
        return head;

    }
    private ListNode deleteLast(){
        ListNode current=head;
        if(head==null){
            return null;
        }
        if(head.next==null){
            head=null;
            return null;
        }

        while(current.next.next!=null){
            current=current.next;
        }
        current.next=current.next.next;

        return head;
    }
    public static void main(String[] args){
       LinkedList obj=new LinkedList();
        obj.insertLast(10);
        obj.insertLast(20);
        obj.insertLast(30);
        obj.insertLast(90);
        obj.insertLast(99);
        obj.display();
        obj. deleteAtGivenPositionInALinkedlist(5);
        obj.display();

    }
}