public class Fibonacci
{
    public int getFibo(int t1, int t2)
    {
         while(t1<=10)
        {
            int sumfibo = t1+t2;
            t1=t2;
            t2 = sumfibo;
        
        }
        return t1;

    }

    public static void main(String[] args)
    {
        int n = 10;
        int t1 = 0;
        int t2 = 1;
        //int sumfibo;

        Fibonacci   f = new Fibonacci();
        int v = f.getFibo(t1,t2);
        
        System.out.println(v);
    }
}