package linkedlist;

import java.util.LinkedList;

public class AddFirst {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        // step 1 -> create a node or linked list
        Node newNode=new Node(data);
        if (head==null){
            head=tail=newNode;
            return;
        }
        //step 2-> add the new node in linked list
        newNode.next=head;
        //step 3-> define head
        head=newNode;

    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if (head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.addFirst(2);
        ll.addLast(5);
        ll.addLast(6);
    }
}
