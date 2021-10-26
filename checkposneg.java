import java.util.Scanner;


	public class checkposneg {
		public static void  posneg(int a) {
			if(a>0) {
				System.out.println(a+ " is a positive number");
				
			}
			
			else
				System.out.println(a + " is a negative number");
			
		}

		
		public static void main(String args[]) {
			Scanner sc= new Scanner(System.in);
			System.out.println("enter  any number");
			int c= sc.nextInt();
			posneg(c);
			
			
		
		}
	}


