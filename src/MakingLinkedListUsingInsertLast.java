public class MakingLinkedListUsingInsertLast {
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
    }
    public static void main(String[] args){
        MakingLinkedListUsingInsertLast obj=new MakingLinkedListUsingInsertLast();
        obj.insertLast(10);
        obj.insertLast(20);
        obj.insertLast(30);
        obj.insertLast(90);
        obj.display();

    }
}
