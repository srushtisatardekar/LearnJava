class Node{
    Node next;
    int data;
    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
class StackLL
{
    Node top;
    public StackLL()
    {
        this.top = null;
    }

    public void push(int value)
    {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println(value+ "Pushed into stack") ;
    }

    public int peek()
    {
        if(top == null)
        {
            return -1;
        }
        else{
            return top.data;
        }
    }
    public int pop()
    {
        if (isEmpty()) {
            System.out.println("Stack underflow");
            return -1; 
        }
        int value = top.data;
        top=top.next;
        return value;
    }
    public boolean isEmpty(){
        if(top == null)
        {
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String args[])
    {
        StackLL st = new StackLL();
        st.push(10);
        st.push(20);
        st.peek();
       
        System.out.println("Top element: " + st.peek());
        System.out.println(st.pop() + " popped from stack");
        System.out.println(st.pop() + " popped from stack");


        System.out.println("Is the stack empty? " + st.isEmpty());
        
        

    }
}
