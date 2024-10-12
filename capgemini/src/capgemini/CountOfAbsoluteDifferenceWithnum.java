package capgemini;
import java.util.Scanner;
public class CountOfAbsoluteDifferenceWithnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the array length:");
		int len=sc.nextInt();
		int[] nums=new int[len];
		System.out.print("Enter the array elements:");
		for(int i=0;i<len;i++) {
			nums[i]=sc.nextInt();
		}
		System.out.print("Enter the num:");
		int num=sc.nextInt();
		System.out.print("Enter the diff:");
		int diff=sc.nextInt();
		System.out.println("count:"+countAbsoluteDiffWithnum(nums,len,num,diff));
	}
	public static int countAbsoluteDiffWithnum(int[] nums,int len,int num,int diff) {
		int ans=0;
		for(int i=0;i<len;i++) {
			if(Math.abs(nums[i]-num)<=2) {
				ans++;
			}
		}
		return ans;
	}

}
