// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class FindDigit {
    public boolean checkNum(String s1)
    {
        boolean flag = true;
        char[] n = s1.toCharArray();
       
        for (int i=0; i<=s1.length()-1; i++)
        {
            //invalid chars
            if((n[i]<'0') || (n[i]>'9'))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
    FindDigit h = new FindDigit();
    String s1 = "123f";
    if(h.checkNum(s1))
    {
        System.out.println("String contains only digits");
    }
    else{
        System.out.println("String does not contain only digits");
    }
    
    
    }
}