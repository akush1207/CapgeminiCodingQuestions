package capgemini;
import java.util.Arrays;
import java.util.Scanner;
public class IsStringArrayEquivalent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st array length:");
		int len1=sc.nextInt();
		String[] arr1=new String[len1];
		System.out.println("Enter 1st array elements:");
		for(int i=0;i<len1;i++) {
			arr1[i]=sc.next();
		}
		System.out.println("Enter 2nd array length:");
		int len2=sc.nextInt();
		String[] arr2=new String[len2];
		System.out.println("Enter 2nd array elements:");
		for(int i=0;i<len1;i++) {
			arr2[i]=sc.next();
		}
		if(isEquivalent(arr1,arr2)) {
			System.out.println("Both array are equivalent.");
		}else {
			System.out.println("Both array are not equivalent");
		}
	}
	public static boolean isEquivalent(String[] arr1,String[] arr2) {
		String str1=String.join("", arr1);
		String str2=String.join("", arr2);
		return str1.equals(str2);
	}

}
