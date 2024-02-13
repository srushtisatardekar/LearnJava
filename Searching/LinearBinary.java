class LinearBinary{

    public int LinearSearch(int arr[], int size, int element)
    {
        for(int i=0; i<size; i++)
        {
            if(arr[i]==element)
            {
                return i;
            }
            
        }
        return -1;

    }
    
    public int binarySearch(int arr2[], int size, int element)
    {
        int low=0;
        int high = size-1;
        int mid;
        while(low<=high)
        {
            mid = (low+high)/2;

            if(arr2[mid]==element)
            {
                return mid;
            }
            if(arr2[mid]<element)
            {
                low = mid+1;
            }
            else{
                high = mid -1;
            }
        }
        return -1;

    }
    public static void main (String args[])
    {
        int arr[] ={2,3,6,77,32,1,5,675};
        int arr2[] ={1,2,3,20,40,77,89};
        int size = arr.length;
        int element = 77;
        LinearBinary searcher = new LinearBinary();
       // int searchIndex = searcher.LinearSearch(arr, size, element);
        int searchIndex = searcher.binarySearch(arr2, size, element);


        if(searchIndex!=-1)
        {
            System.out.println("ELement was found at index" +searchIndex);
        }
        else{ System.out.println("ELement was not found " ); }
       

    }
}