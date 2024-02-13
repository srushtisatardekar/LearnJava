public class InsertionSort{
    public static void insSort(int arr[])
    {
        for(int i=1; i<arr.length; i++)
        {
            int key = arr[i];
            int j = i-1;
            while(( j>-1) && (arr[j]> key))
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }


public static void main(String args[])
{
    int arr[] = {12,11,13,5,6};
    System.out.println(
        "Before insertion sort"
    );
    for(int i=0; i<arr.length; i++)
    {
        System.out.println(arr[i]+ " ");
    }
    System.out.println();
    insSort(arr);

    System.out.println(
        "After insertion sort"
    );
    for(int i=0; i<arr.length; i++)
    {
        System.out.println(arr[i]+ " ");
    }


}
}