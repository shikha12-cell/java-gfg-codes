import java.util.*;
import java.io.*;
public class replacement {
	
	public static  int convertfive(int num) {
	        int i=1;
	        int r=0;
	        int ans=0;
	        
	        // Your code here
	        while(num>0){
	            r=num%10;
	            if(r==0){
	                
	                ans+=5*i;
	            }
	            else{
	                ans+=r*i;
	            }
	            i*=10;
	            num/=10;
	        }
	        return ans;
	    }
	 public static void main(String args[]) {
		 replacement r= new replacement();
		 Scanner sc= new Scanner(System.in);
		 System.out.println("enter any number");
		 int n= sc.nextInt();

		System.out.println(r.convertfive(n));
		 
	 }

}
