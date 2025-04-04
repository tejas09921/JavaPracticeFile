package LinkedList;

public class Creation {
    public static void Display(Node head){   // ya line madhe first elment mence link list cha head pass karaycha
        Node temp=head;
        while (temp!=null){
              System.out.print(temp.data+" ");
              temp =temp.next;
          }
    }
    public static void DisplayRecrtion(Node head){
        if(head==null) return;
        DisplayRecrtion(head.next);
        System.out.println(head.data+ " ");
    }
    // Count the linl list
    public static void length(Node head){
        int count=0;
        while (head!=null) {
            count++;
            head=head.next;
        }
        System.out.println(count);
    }
    public static void DisplayReerse(Node head){
        if(head==null) return;
        System.out.println(head.data+ " ");
        DisplayRecrtion(head.next);
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a =new Node(4);
//        System.out.println(a.next);
        Node b =new Node(5);
        Node c =new Node(6);
        Node d =new Node(7);
        Node e =new Node(8);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
/*
        // print all link list 
        //temp =temp.next;
//        for (int i = 0; i < 5; i++) {
//            System.out.print(temp.data+ " ");
//            temp =temp.next;
//        }
        // PRint all Link List on While Loop
//        while (temp!=null){
//            System.out.print(temp.data+" ");
//            temp =temp.next;
//        }


 */
        Display(a);
        length(a);
    }
}
