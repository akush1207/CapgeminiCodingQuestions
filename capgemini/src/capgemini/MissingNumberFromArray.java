package capgemini;

import java.util.Scanner;

public class MissingNumberFromArray {

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
		System.out.println("Missing Number:"+missingNumber(arr,len));
	}
	public static int missingNumber(int[] arr,int len) {
		int actualSum=(len*(len+1))>>1;
		int sum=0;
		for(int a:arr) {
			sum+=a;
		}
		return actualSum-sum;
	}

}
