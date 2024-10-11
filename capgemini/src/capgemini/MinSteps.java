package capgemini;
import java.util.Scanner;
public class MinSteps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n and m:");
		int n=sc.nextInt();
		int m=sc.nextInt();
		System.out.println("Min Steps:"+minSteps(n,m));
	}
	public static int minSteps(int n,int m) {
		int step=n/m;
		if(n%m!=0) {
			step+=(n%m);
		}
		return step;
	}

}
