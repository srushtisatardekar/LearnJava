// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class ReverseLinkedList {
    class Node
    {
        int data;
        Node next;
        
        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
        public Node head = null;
        public Node tail = null;
        public Node temp = null;

        
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
            tail =newNode;
        }
        
    }
        
        public void displayNode()
        {
            Node current = head;
        if(head ==null)
        {
            System.out.println("List is empty");
        }
        else
        {
            while(current!=null)
            {
                System.out.print(current.data);
                current = current.next;
            }
        }
        }
        
        public void revList()
        {
            if(head == null)
            {
                return;
            }
            Node prev = head;
            Node curr = head.next;
            
            while(curr!=null)
            {
                Node nxt = curr.next;
                curr.next = prev;
                
                prev = curr;
                curr =nxt;
            }
            head.next = null;
            head = prev; 
           
        }
    
        
        
    
    public static void main(String[] args) {
        ReverseLinkedList st = new ReverseLinkedList();
        st.insertNode(1);
        st.insertNode(2);
        st.insertNode(3);
        st.insertNode(4);
        st.insertNode(5);
        System.out.print("Linked List is: " );
        st.displayNode();
        System.out.println();

        System.out.print("Reversed Linked List is: " );
        st.revList();
        st.displayNode();
       

        
    }
}