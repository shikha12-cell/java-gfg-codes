import java.util.*;
public class valueequaltoindex {
	
	 public static void equaltoindex(int arr[], int n) {
	        // code here
		 int i;
	        
	        for( i=0;i<n-1;i++){
	        	
	            
	            if(arr[i]==i+1) {
	            	
	            	break;
	            }
	         
	            
	        
	    }
	        System.out.println("The index is" + arr[i]);
	        
           
        
	
	}


public static void main(String[] args)
{
    int[] arr = { 33, 2,3,56 };
    

    System.out.println("Array elements are");
    System.out.println(Arrays.toString(arr));
   
    

    equaltoindex(arr, arr.length);       

}


}
