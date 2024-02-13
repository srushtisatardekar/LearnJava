class LinkedListnew{
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

    public void addNode(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            tail = newNode;
        }
        else{
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
                System.out.println(curr.data+" " );
                curr = curr.next;
            }
        }
    }

    public static void main(String[] args)
    {
        LinkedListnew nn = new LinkedListnew ();
        nn.addNode(1);
        nn.addNode(2);
        nn.addNode(4);
        nn.displayNode();

    }

}