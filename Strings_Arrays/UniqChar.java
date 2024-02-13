// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class UniqChar {
    
    public boolean checkUnique(String str)
    {
        for(int i = 0; i<str.length();i++)
        {
            for(int j = i+1; j<str.length(); j++)
            {
                if(str.charAt(i) == str.charAt(j))
                {
                    return false;
                }
               
            }
        }
         return true;
    }
    public static void main(String[] args) {
      
        UniqChar h = new UniqChar();
        String str = "";
        boolean result = h.checkUnique(str);
        if(result == true){
            System.out.println("String has unique chars");
        }
        else{
            System.out.println("String do not have all unique chars");
        }
    }
}