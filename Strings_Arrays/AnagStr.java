public class AnagStr {
    public boolean findAnag(String s1, String s2)
    {
        if(s1.length()!=s2.length())
        {
            return false;
        }
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int[] temp = new int[s1.length()];
        int t= 0;
        
        for(int i=0; i<=c1.length-1; i++)
        {
            for(int j =0; j<c2.length; j++)
            {
                if(c1[i]==c2[j])
                {
                    temp[t++]=j; 
                    break;
                }
                if((c1[i]!=c2[j]) && (j==c2.length-1))
                {
                    return false;
                }
            }
        }
        
       return true;
    }
    public static void main(String[] args) {
       String s1 = "face";
       String s2 = "caef";
       
       AnagStr h = new AnagStr();
       
       if(h.findAnag(s1,s2))
       {
           System.out.println("It is an anagram");
       }
       else{
           System.out.println("It is not an anagram");
       }
       
       
    }
}
