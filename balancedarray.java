import java.util.*;
public class balancedarray {
	 long minValueToBalance(long a[] ,int n)
	    {
	int c= n/2;
	int sum1=0;
	int sum2=0;
	for(int i =0;i<c;i++){
	    sum1+=a[i];
	}
	for(int j=c;j<n;j++){
	    sum2+=a[j];
	    
	}
	return Math.abs(sum1-sum2);
	    }
	
public static void main(String args[]) {
	balancedarray b =new balancedarray();
	 long  [] arr = {3,2,5,1  };
	 System.out.println("Array is :");
       System.out.println(Arrays.toString(arr));
       System.out.println(b. minValueToBalance(arr,arr.length));  
    
       
       
}
}
