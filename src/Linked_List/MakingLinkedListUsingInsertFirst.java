package Linked_List;

public class MakingLinkedListUsingInsertFirst {
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
        MakingLinkedListUsingInsertFirst obj=new MakingLinkedListUsingInsertFirst();
        obj.insertFirst(10);
        obj.insertFirst(20);
        obj.insertFirst(30);
        obj.insertFirst(90);
        obj.display();
    }
}