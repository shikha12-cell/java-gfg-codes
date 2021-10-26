import java.util.Arrays;

public class arraypalindrome {
 public static int arrpalind(int arr[],int n) {
	
	 
		int i=0;
		  for(i=0;i<n;i++) {
			  
			  int ans=0;
			 int  temp=arr[i];
		     while(temp>0) {
			int rem= temp%10;
               temp/=10;
               ans = ans*10 + rem;
			
		}
		if(ans!=arr[i]) 
			
			 return 0;
		
		
		
	}
		  return 1;
		 
 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arraypalindrome m= new arraypalindrome();
		 int [] arr = {111,222,333,444  };
		 arrpalind(arr,arr.length);
	     
	    	//System.out.println(m.arrpalind(arr,arr.length));
	    	if(arrpalind(arr,arr.length)==1) {
	    		System.out.println("given array is palindrome");
	    	}
	    	else
	    		System.out.println("given array is not palindrome");
	    	
	       }
		
	

}
