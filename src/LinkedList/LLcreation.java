package LinkedList;

public class LLcreation {
    private static class Node{
        int data;
        Node next;
        Node head;
        Node tail;
        int size;
        Node(int data){
            this.data=data;
            this.next=null;
        }
        //Add a Node at the end of the List
        public void add(int data){
            Node newNode=new Node(data);
            newNode.next = head;
            if(head==null){ //if a list is empty
                head=newNode;
                tail=newNode;
            }else {
                tail.next=newNode;
                tail=newNode;
            }
            size++;
        }
        public void update(int data){

        }




    }
}
