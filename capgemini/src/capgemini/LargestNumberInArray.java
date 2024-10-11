package capgemini;

import java.util.Scanner;

public class LargestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array length:");
		int len=sc.nextInt();
		int[] arr=new int[len];
		System.out.print("Enter array elements:");
		for(int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Largest Number:"+largestNumber(arr,len));
	}
	public static int largestNumber(int[] arr,int len) {
		int largest=Integer.MIN_VALUE;
		for(int i=0;i<len;i++) {
			largest=Math.max(largest, arr[i]);
		}
		return largest;
	}

}
