package capgemini;
import java.util.Scanner;
public class CheckStringIsPalinorme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string:");
		String str=sc.nextLine();
		if(isPalindrome(str)) {
			System.out.println("\""+str+"\" is palindrome.");
		}else {
			System.out.println("\""+str+"\" is not palindrome.");
		}
	}
	public static boolean isPalindrome(String str) {
		StringBuilder sb=new StringBuilder(str);
		return sb.reverse().toString().equals(str);
	}

}
