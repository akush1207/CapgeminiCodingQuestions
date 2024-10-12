package capgemini;

import java.util.Arrays;
import java.util.Scanner;

public class ProductOgSmallestPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array length:");
		int len=sc.nextInt();
		int[] arr=new int[len];
		System.out.print("Enter the array elements:");
		for(int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter the sum:");
		int sum=sc.nextInt();
		System.out.println("Product:"+product(arr,len,sum));
	}
	public static int product(int[] arr,int len,int sum) {
		if(len<2) {
			return -1;
		}
		Arrays.sort(arr);
		if((arr[0]+arr[1])<=sum) {
			return arr[0]*arr[1];
		}
		return 0;
	}

}
