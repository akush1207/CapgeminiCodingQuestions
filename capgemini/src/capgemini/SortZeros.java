package capgemini;

import java.util.Arrays;
import java.util.Scanner;
public class SortZeros {

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
		System.out.println("arr:"+Arrays.toString(arr));
		sortZero(arr,len);
		System.out.println("arr:"+Arrays.toString(arr));
	}
	public static void sortZero(int[] arr,int len) {
		int ind=-1;
		for(int i=0;i<len;i++) {
			if(arr[i]!=0) {
				arr[++ind]=arr[i];
			}
		}
		ind++;
		for(int i=ind;i<len;i++) {
			arr[i]=0;
		}
	}

}
