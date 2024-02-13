// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//sorted
class DupLinkedList {
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
    
    public void addNode(int data)
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
        Node curr = head;
        if(head == null)
        {
            System.out.println("List is empty");
        }
        else
        {
            while(curr!=null)
            {
                System.out.print(curr.data +" ");
                curr = curr.next;
            }
        }
    }
    
    public void removeDup()
    {
        Node curr = head;
        Node index = curr.next;
        Node n;
        if(head == null)
        {
            return ;
        }
        while(curr.next!=null)
        {
            if(curr.data == curr.next.data)
            {
                n = curr.next.next;
                curr.next = n;
            }
            else
            {
                curr= curr.next;
            }
        }
    }
    
    
    
    public static void main(String[] args) {
        System.out.println("Linked List is:");
        DupLinkedList Dlist = new DupLinkedList();
        
        Dlist.addNode(1);
        Dlist.addNode(2);
        Dlist.addNode(2);
        Dlist.displayNode();
        
        System.out.println();
        Dlist.removeDup();
        Dlist.displayNode();
        
    }
}