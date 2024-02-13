// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class LinkedListinsm {
    class Node{
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
    
    public void insertAtFrontNode(int data)
    {
        Node newNode = new Node(data);
        
        if(head == null)
        {
           System.out.println("List is empty");
        }
        else
        {
            newNode.next = head;
            head = newNode;
        }
        
    }
    
    public void insertMiddleNode(int data, int givdata)
    {
        Node curr = head;
        Node prev = curr;
        Node newNode = new Node(data);
        
        if(head == null)
        {
            head = newNode;
        }
        if(prev.data!=givdata)
        {
            prev= prev.next;
            curr = curr.next;
        }
        curr = curr.next;
        newNode.next = curr;
        prev.next = newNode;
        
    }
    

    public void deleteNode(int del)
    {
        Node curr = head;
        Node prev = null;
        while(curr!=null && del!=curr.data)
        {
            prev = curr;
            curr=curr.next;
        }
        prev.next = curr.next;
        curr.next = null;
        
    }
    

    public void deleteFirstNode()
    {
        Node prev = null;
        
        if(head == null)
        {
           System.out.println("List is empty");
        }
        else
        {
            prev = head;
            head = head.next;
            prev =null;
        }
    }
    public void deleteAtEndNode()
    {
        Node curr=head;
        Node prev = null;
        if(head ==null)
        {
            System.out.println("List is empty");
        }
        else{
            while(curr.next.next!=null)
            {
               curr = curr.next;
            }
            curr.next = null;
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
    public boolean searchNode(int data)
    {
       Node curr = head;
       if(head == null)
       {
           System.out.println("List is empty");
       }
       while(curr!=null)
       {
           if(curr.data==data)
           {
               return true;
           }
           curr = curr.next;
       }
       return false;
    }
    
    public static void main(String[] args) {
        LinkedListinsm st = new LinkedListinsm();
        st.insertNode(1);
        st.insertNode(2);
        st.insertNode(3);
        st.insertNode(4);
        st.insertNode(5);
        System.out.print("Linked List is: " );
        st.displayNode();
        
        //insert first node        
        // st.insertAtFrontNode(7);
        // System.out.println();
        // st.displayNode();
        
        //insert middle node after given no.
         st.insertMiddleNode(1,1);
         System.out.println();
         st.displayNode();
         
         //search node in list
         System.out.println();
         if(st.searchNode(9))
         {
             System.out.println("It is found");
         }
         else
         {
             System.out.println("not found");
         }

         
        
        //delete first node
        // st.deleteFirstNode();
        // System.out.println();
        // st.displayNode();
        
        //delete end node
        // st.deleteAtEndNode();
        // System.out.println();
        // st.displayNode();
        
        //delete specified node
        // st.deleteNode(3);
        // System.out.println();
        // st.displayNode();
    }
}