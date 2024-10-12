package capgemini;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the n:");
		int n=sc.nextInt();
		System.out.println("Fibonacci series");
		fib(n);
	}
	public static void fib(int n) {
		if(n==0) {
			System.out.println("0");
			return;
		}
		if(n==1) {
			System.out.println("1");
			return;
		}
		int first=0,second=1;
		System.out.print(first+" "+second);
		for(int i=2;i<=n;i++) {
			int last=first+second;
			first=second;
			second=last;
			System.out.print(" "+last);
		}
	}

}
