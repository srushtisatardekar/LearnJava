// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class SortLinkedList {
    class Node
    {
        int data;
        Node next;
        
        public Node (int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public Node head = null;
    public Node tail = null;
    
    public void sortList()
    {
        int temp;
        Node curr = head;
        Node index = null;
        
        if(head == null)
        {
            return;
        }
        else
        {
            while(curr !=null)
            {
                index = curr.next;
                
                while(index!=null)
                {
                    if(curr.data > index.data)
                    {
                        temp = curr.data;
                        curr.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                curr = curr.next;
            }
        }
    }
    
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
            while(current != null)
            {
                System.out.print(current.data+" ");
                current = current.next;
            }
        }
    }
    
    
    public static void main(String[] args) {
        SortLinkedList slist = new SortLinkedList();
        
        slist.insertNode(4);
        slist.insertNode(3);
        slist.insertNode(6);
        slist.displayNode();
        
        System.out.println();
        slist.sortList();
        slist.displayNode();
        
    }
}