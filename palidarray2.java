import java.util.*;

public class palidarray2 {
	int palind(int arr[],int n) {
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
		palidarray2 p= new palidarray2 ();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size of an array");
		int n=0;
		n=sc.nextInt();
		int arr[]= new int[n];
	System.out.println("enter array values");
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
		
System.out.println("entered array is :");
for(int i=0;i<n;i++) {
	System.out.println(arr[i]);
}
   System.out.println(p.palind(arr,n));
if(p.palind(arr,n)==1) {
	System.out.println("given array is a plaindrome");
}
else
	System.out.println("given array is not a palindrome");
	}

}
