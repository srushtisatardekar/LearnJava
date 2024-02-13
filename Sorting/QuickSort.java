class QuickSort{
    public int partitionArray(int arr[],int lb, int ub)
    {
        int pivot = arr[lb];
        int start = lb +1 ;
        int end = ub;

        while(start<end)
        {
            while(arr[start] <= pivot)
            {
                start++;
            }
            while(arr[end] > pivot)
            {
                end--;
            }
            if(start < end)
            {
                swap(arr,start,end);
            }

        }
        swap(arr,lb,end);
        return end;

    }
    public void qSort(int arr[], int lb,int ub)
    {   
        if(lb < ub)
        {
            int loc = partitionArray(arr,lb,ub);
            qSort(arr,lb,loc-1);
            qSort(arr,loc+1,ub);
        }

    }
    public void swap(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
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

        int[] arr = {16,10,5,9,2,1,15,7};
        QuickSort q = new QuickSort();
        System.out.println("Array Before Quick Sort: ");
        q.printArray(arr);
        q.qSort(arr,0,arr.length-1);

        System.out.println("Array After Quick Sort: ");
        q.printArray(arr);
    }

}