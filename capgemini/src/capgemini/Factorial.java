package capgemini;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the n:");
		int n=sc.nextInt();
		System.out.println("Factorial of "+n+" is "+factorial(n)+".");
	}
	public static int factorial(int n) {
		int ans=1;
		for(int i=1;i<=n;i++) {
			ans*=i;
		}
		return ans;
	}

}
