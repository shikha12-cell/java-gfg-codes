
import java.util.*;
import java.io.*;
//Method 1
public class sortbinaryarray {
	
	//int i,j;
	public static void swap(int arr[],int i,int j){
        int temp=0;
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

 static int [] SortBinaryArray(int arr[],int n)
 {
    
    int j=-1;
    int pivot =0;
    for(int i =0;i<n;i++){
        if(arr[i]<=pivot){
            j++;
            swap(arr,i,j);
        }
    }
    return arr;
 }

	
	
	public static void main(String args[]) {
		 int[] arr = { 1, 0,1,1,0,0 };
		 System.out.println("Before swapping");
	        System.out.println(Arrays.toString(arr));
	        SortBinaryArray(arr,6);
	        System.out.println("after swapping");
	        System.out.println(Arrays.toString(arr));
	        
	        
	}
}

