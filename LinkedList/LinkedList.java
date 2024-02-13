// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class LinkedList {
    class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public Node head = null;
    public Node tail = null;
    public void insertNode(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void displayNode()
    {
        Node current = head;
        if(head == null)
        {
            System.out.println("List is empty");
        }
        else
        {
            while(current!=null)
            {
                System.out.print(current.data +" ");
                current = current.next;
            }
        }
    }
    public void deleteNode(int del)
    {
        Node curr = head;
        Node prev = null;
        int a;
         //System.out.print(curr.data +" ");
        while(curr!=null && del != curr.data)
        {
           //System.out.print(curr.data +" ");
            prev = curr;
            curr = curr.next;
        }
          
          //System.out.print(prev.data +" ");
        prev.next = curr.next;
        curr.next = null;
        
        
    }
    public static void main(String[] args) {
    LinkedList st = new LinkedList();
    st.insertNode(1);
    st.insertNode(2);
    st.insertNode(3);
    st.insertNode(4);
    st.insertNode(5);
    st.displayNode();
    
    st.deleteNode(3);
    System.out.println();
    st.displayNode();
    }
}