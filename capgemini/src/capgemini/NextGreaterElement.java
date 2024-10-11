package capgemini;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
public class NextGreaterElement {

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
		//nextGreaterBruteFroce(arr,len);
		//System.out.println("arr:"+Arrays.toString(arr));
		nextGreaterOptimum(arr,len);
		System.out.println("arr:"+Arrays.toString(arr));	
	}
	public static void nextGreaterBruteFroce(int[] arr,int len) {
		for(int i=0;i<len;i++) {
			int nge=-1;
			for(int j=i+1;j<len;j++) {
				if(arr[j]>arr[i]) {
					nge=arr[j];
					break;
				}
			}
			arr[i]=nge;
		}
	}
	public static void nextGreaterOptimum(int[] arr,int len) {
		Stack<Integer> st=new Stack<>();
		int[] temp=new int[len];
		for(int i=len-1;i>=0;i--) {
			while(!st.isEmpty() && st.peek()<=arr[i]) {
				st.pop();
			}
			temp[i]=st.isEmpty()? -1:st.peek();
			st.push(arr[i]);
		}
		for(int i=0;i<len;i++) {
			arr[i]=temp[i];
		}
	}

}
