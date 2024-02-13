class StackA{
    static final int MAX_SIZE = 1000;
    int arr[] =new int [MAX_SIZE];
    int top;

    public StackA()
    {
        this.top = -1;
    }
    public void push(int value)
    {
        if(top >= MAX_SIZE -1)
        {
            System.out.println("Stack overflow");
            return ;
        }
        arr[++top] = value;
        System.out.println(value+ "pushed into stack");

    }
    public int pop()
    {
        if(top < 0)
        {
            System.out.println("Stack underflow");
            return -1;
        }
        int value = arr[top--];
        
        return value;

    }
    public int peek()
    {
        if(top < 0)
        {
            System.out.println("Stack is empty");
            return -1;
        }
        else{
            return arr[top];
        }

    }
    public boolean isEmpty()
    {
        if(top < 0)
        {
            return true;
        }
        return false;
    }
    public void show()
    {
        for(int i =top; i>-1; i--)
        {
             System.out.print(" "+ arr[i]); 
        }
    }

    public static void main(String args[])
    {
        StackA st = new StackA();
        st.push(10);
        st.push(20);
        st.push(30);
        st.peek();
        System.out.println("Top element is:" +st.peek());
        System.out.println(st.pop() +" Is Popped from stack");
        System.out.println(st.pop() +" Is Popped from stack");
        System.out.println(st.pop() +" Is Popped from stack");

                System.out.println(st.pop() +" Is Popped from stack");


        System.out.println("Is the stack empty:" +st.isEmpty());
        st.show();


    }
}