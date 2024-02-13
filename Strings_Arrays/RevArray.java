
class RevArray {
    public int[] reverseArray(int[] input) {
        int[] result = new int[input.length];
        int j = 0;
        for(int i =input.length-1; i>=0; i--)
        {
          result[j++] = input[i];
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] input = new int[]{1,2,3,4,5};
        
        
        HelloWorld h = new HelloWorld();
        int[] result = h.reverseArray(input);
        for(int i=0; i<result.length; i++) {
            System.out.print(result[i]);
        }
        
    }
}
