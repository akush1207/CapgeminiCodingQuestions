package capgemini;
import java.util.Scanner;
public class DifferenceFromMtoN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter m and n:");
		int m=sc.nextInt();
		int n=sc.nextInt();
		System.out.println("Difference:"+difference(m,n));
	}
	public static double difference(int m,int n) {
		double evenSum=0.0,oddSum=0.0;
		for(int i=m;i<=n;i++) {
			if(i%2==0) {
				evenSum+=Math.sqrt(i);
			}else {
				oddSum+=Math.sqrt(i);
			}
		}
		return Math.abs(evenSum-oddSum);
	}

}
