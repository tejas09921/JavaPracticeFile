package LinkedList;

public class Starting {
    public static void display(Node head){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    // this method is used to find the length of the linklist
    public static int Findlength(Node head){
        int count=0;
        while (head!=null){
            count++;
            head=head.next;
        }
        return count;
    }
   public static class Node{
       int data;
       Node next;
       Node(int data){
           this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(6);
        Node c=new Node(7);
        Node d=new Node(8);
        Node e=new Node(9);
       a.next=b;
       b.next=c;
       c.next=d;
       d.next=e;

//       Node temp=a;
//        for (int i = 0; i < 5; i++) {
//            System.out.println(temp.data);
//            temp=temp.next;
//        }
        display(a);
        Findlength(a);
    }
}
