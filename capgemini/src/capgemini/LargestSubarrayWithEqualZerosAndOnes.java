package capgemini;
import java.util.HashMap;
import java.util.Scanner;
public class LargestSubarrayWithEqualZerosAndOnes {

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
		System.out.println("Largest Subarray:"+largestSubarray(arr,len));

	}
	public static int largestSubarray(int[] arr,int len) {
		int sum=0,maxLength=0;
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<len;i++) {
			sum+= (arr[i]==0)?-1:1;
			if(sum==0) {
				maxLength=i+1;
			}
			if(map.containsKey(sum)) {
				int subArrayLength=i-map.get(sum);
				maxLength=Math.max(maxLength, subArrayLength);
			}else {
				map.put(sum,i);
			}
		}
		return maxLength;
	}

}
