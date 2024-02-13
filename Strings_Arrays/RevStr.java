class RevStr {
    public char[] getReverse(String s1)
    {
        char[] current = s1.toCharArray();
        char[] rev = new char[s1.length()];
        int j =0;
        for (int i=current.length-1; i>=0; i--)
        {
            rev[j++]=current[i];
        }
        return rev;
    }
    public static void main(String[] args) {
    RevStr h = new RevStr();
    String s1 = "a";
    char[] rev= h.getReverse(s1);
    for(int i=0; i<rev.length;i++)
    {
       System.out.print(rev[i]);
    }
    
    
    }
}