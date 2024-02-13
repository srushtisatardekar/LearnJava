class StackRev{
    int top ;
    int size;
    char[] arr ;
    
    StackRev(int len){
        this.top= -1;
        this.arr = new char[len];
        this.size = len;
    }

    public boolean push(char a)
    {
        if(top>=size)
        {
            System.out.println("Stack overflow");
            return false;
        }
        else{
            System.out.println("Pushed in Stack: " +a);
            arr[++top] = a;
            return true;
        }
    }
    public char pop()
    {
        if(top == -1)
        {
            System.out.println("Stack underflow");
            return '\0'; 
        }
        else{
            char store = arr[top--];
            return store;

        }
    }
    

    public static void main(String args[])
    {
        StackRev sr = new StackRev(4);
        String str = "flow";
        
        int n = str.length(); 
        System.out.println("Input string is:" +str);
        StringBuilder op = new StringBuilder(str);

        int i=0;
        for(i=0; i<n;i++)
        {
            sr.push(str.charAt(i));
        }
        for (i = 0; i < n; i++) {
            char ch = sr.pop();
            op.setCharAt(i, ch);
        }

        System.out.println("Reversed string is " + op);



    }
}