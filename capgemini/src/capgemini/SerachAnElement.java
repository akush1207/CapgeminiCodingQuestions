package capgemini;

import java.util.Scanner;

public class SerachAnElement {

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
		System.out.print("Enter the element to be searched:");
		int ele=sc.nextInt();
		if(search(arr,len,ele)) {
			System.out.println(ele+" is present in the array.");
		}else {
			System.out.println(ele+" is not present in the array.");
		}
	}
	public static boolean search(int[] arr,int len,int ele) {
		int low=0,high=len-1;
		while(low<high) {
			int mid=(low=high)>>1;
			if(arr[mid]==ele) {
				return true;
			}else if(arr[mid]>ele) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return false;
	}

}
