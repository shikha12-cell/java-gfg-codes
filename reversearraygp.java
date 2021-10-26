import java.util.Scanner;

public class reversearraygp {
	//if length of array is odd
	
	public static void  gp1(int arr[],int n,int k) {
		
		if((n&1)>0) {
			for(int i=0;i<n;i+=k) {
				
				for(int j=i+k-1;j>=i;j=j--) {
					System.out.println(arr[j]);
					//k--;
					
				}
				
			}
		}
			
	}

public static void main(String args[]) {
	reversearraygp r= new reversearraygp();
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
System.out.println("reverse array group is:");
 r.gp1(arr,n,3);
	
}
}
