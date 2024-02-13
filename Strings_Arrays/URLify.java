// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class URLify {
    public void urliFy(String str)
    {
        int newLen;
        str = str.trim();
        int origLen= str.length();
        String str2 = "%20";
        int n = str2.length;
        
        char[] s1 = str.toCharArray();
        int len = s1.length;
        int count = 0;
        
        for(int i = 0; i<s1.length; i++)
        {
            
            if(s1[i] == 32)
            {
                count = count+1; 
            }
        }
        newLen = origLen+(n-1)*count;
        str[newLen] ='\0';
        
        for(int i = origLen-1; i>=0; i++)
        {
            if(str[i] == ' ')
            {
                str[newLen -1] == '0';
                str[newLen - 2] =='2';
                str[newLen -3] == '%';
                newLen = newLen -3;
            }
            else
            {
               str[newLen-1] = str[i];
               newLen = newLen -1;
            }
            
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        URLify h = new URLify();
        String str = "Mr John Smith   ";
        //System.out.println(str.length());
        int v = h.urliFy(str);
        System.out.println(v);
    }
}