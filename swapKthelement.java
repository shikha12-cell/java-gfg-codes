import java.util.Arrays;

public class swapKthelement {
	

public static void swap(int a[],int n,int k) {
	int temp;
	temp=a[k];
	
	a[k]=a[n-k];
	a[n-k]=temp;
	
	
}
	
	
	
	public static void main(String[] args)
    {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
 
        System.out.println("Before swapping with Kth element");
        System.out.println(Arrays.toString(arr));
        swap(arr,8,2);

        System.out.println("After swapping");
        System.out.println(Arrays.toString(arr));
	
}
}
