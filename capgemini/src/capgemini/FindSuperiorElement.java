package capgemini;
import java.util.Scanner;
public class FindSuperiorElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array length:");
		int len=sc.nextInt();
		int[] arr=new int[len];
		System.out.print("Enter array element:");
		for(int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("No. of superior element in the array are "+superior(len,arr)+".");
	}
	public static int superior(int len,int [] arr) {
		int ans=0,max=Integer.MIN_VALUE;
		for(int i=len-1;i>=0;i--) {
			if(arr[i]>max) {
				max=arr[i];
				ans++;
			}
		}
		return ans;
	}

}
