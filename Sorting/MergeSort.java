class MergeSort{

    public void mSort(int arr[], int beg, int mid,int end)
    {
        int i = beg;
        int j= mid+1;
        int k= beg;
        int[] b = new int[arr.length];

        while(i <=mid && j<=end)
        {
            if(arr[i] <= arr[j] )
            {
                b[k] = arr[i];
                i++;
            }
            else{
                b[k] = arr[j];
                j++;
            }
            k++;
        }

        if(i>mid)
        {
            while(j<=end)
            {
                b[k] = arr[j];
                j++;
                k++;
            }
        }
        else{
            while(i<=mid)
            {
                b[k] = arr[i];
                i++;
                k++;

            }
        }
        for( k =beg; k<=end; k++)
        {
            arr[k] = b[k];
        }


    }

    public void mergeSort(int arr[], int beg ,int end)
    {
        if(beg<end)
        {
            int mid = (beg+end)/2;
            mergeSort(arr,beg,mid);
            mergeSort(arr,mid+1,end);
            mSort(arr,beg,mid,end);
        }
    }

    public void printArray(int arr[])
    {
        for(int ele:arr)
        {
            System.out.println(ele);
        }
        System.out.println("");
    }
    public static void main(String args[])
    {
        int arr[] ={1,-21,13,41,15};
        MergeSort ob = new MergeSort();
        System.out.println("Array before sort: ");
        ob.printArray(arr);

        
        ob.mergeSort(arr,0,arr.length-1);

        System.out.println("\nSorted array"); 
        ob.printArray(arr);
    }
}