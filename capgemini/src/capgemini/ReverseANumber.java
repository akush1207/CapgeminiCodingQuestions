package capgemini;
import java.util.Scanner;
public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		System.out.println("reverse:"+reverse(num));
	}
	public static int reverse(int num) {
		int rev=0;
		while(num!=0) {
			int mod=num%10;
			rev=(rev*10)+mod;
			num/=10;
		}
		return rev;
	}

}
