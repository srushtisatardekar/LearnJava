public class AnagIt {
    public static void main(String[] args) {
        int[] a1=new int[]{1,2,3,4};
        int[] a2=new int[]{};
        int[] temp= new int[a1.length];
        int t=0;
        boolean flag = true;
        
        if(a1.length == a2.length)
        {
            flag = false;
        }
        
        for(int i=0; i<=a1.length-1; i++)
        {
            for(int j =0; j<a2.length; j++)
            {
                if(a1[i]==a2[j])
                {
                    temp[t++]=j; 
                    break;
                }
                if((a1[i]!=a2[j]) && (j==a2.length-1))
                {
                    flag = false;
                }
            }
        }
        if(flag == true)
        {
            System.out.println("It is an anagram");
        }
        else
        {
            System.out.println("It is not an anagram");
        }
        
    }
}
