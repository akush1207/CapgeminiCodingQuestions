package capgemini;
import java.util.Scanner;
public class BinaryOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.next();
		System.out.println("ans:"+operation(str));
	}
	public static int operation(String str) {
		if(str==null) {
			return -1;
		}
		int ans=str.charAt(0)-'0';
		for(int i=1;i<str.length();i+=2) {
			if(i+1>str.length()) {
				return ans;
			}
			if(str.charAt(i)=='A') {
				ans&=str.charAt(i+1)-'0';
			}else if(str.charAt(i)=='B') {
				ans|=str.charAt(i+1)-'0';
			}else if(str.charAt(i)=='C') {
				ans^=str.charAt(i+1)-'0';
			}
		}
		return ans;
	}

}
