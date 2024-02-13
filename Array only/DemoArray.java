import java.util.*;

public class DemoArray {
    public void display(int arr[], int size) {
        // Traversal
        int n = arr.length;
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
//insertion
    public boolean indInsertion(int myArr[], int size, int element, int capacity, int index) {
        if (size >= capacity) {
            return false;
        }
        for (int i = size - 1; i >= index; i--) {
            myArr[i + 1] = myArr[i];
        }
        myArr[index] = element;
        size += 1;
        return true;
    }

//deletion
public boolean indDeletion(int myArr[], int size, int index){
    if(index >= size || index < 0)
    {
        return false;
    }
    for(int i=index; i<size-1; i++)
    {
        myArr[i] =myArr[i+1];
    }
    //size -= 1;
    return true;
    
}

    public int[] newArray() {
        int[] myArray = new int[100];
        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 4;
        myArray[3] = 8;
        myArray[4] = 9;

        //display(myArray);
        return myArray;
    }

    public static void main(String[] args) {
        DemoArray da = new DemoArray();

        int size = 5, element = 45, index = 3;
        int[] myArr = da.newArray();
        da.indInsertion(myArr, size, element, 100, index);
        da.display(myArr,size);
        da.indDeletion(myArr,size,index);
        size -=1;
        da.display(myArr,size);
    }
}
