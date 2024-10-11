package capgemini;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSubarraySum {

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
		System.out.println("Max Sum:"+maxSubArraySum(arr,len));

	}
	public static int maxSubArraySum(int[] arr,int len) {
		int maxSum=Integer.MIN_VALUE,sum=0,start=-1,end=-1,tempStart=-1;
		for(int i=0;i<len;i++) {
			if(sum==0) {
				start=i;
			}
			sum+=arr[i];
			if(sum<0) {
				sum=0;
				tempStart=i+1;
			}
			if(sum>maxSum) {
				end=i;
				start=tempStart;
				maxSum=sum;
			}
		}
		System.out.println("max sum subarray:"+Arrays.toString(Arrays.copyOfRange(arr, start,end+1)));
		return maxSum;
	}

}
