package capgemini;
import java.util.Scanner;
public class OccurenceOfElementInArray {

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
		System.out.print("Enter the element:");
		int ele=sc.nextInt();
		System.out.println("Frequency of \""+ele+"\":"+countOfElement(arr,ele));
	}
	public static int countOfElement(int[] arr,int ele) {
		int count=0;
		for(int a:arr) {
			if(a==ele) {
				count++;
			}
		}
		return count;
	}

}
