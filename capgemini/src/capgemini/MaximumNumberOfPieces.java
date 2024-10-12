package capgemini;
import java.util.Scanner;
public class MaximumNumberOfPieces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the n:");
		int n=sc.nextInt();
		System.out.println("Max Pieces:"+maxPieces(n));
	}
	public static int maxPieces(int n) {
		long pieces=(long)(n*(n+1))>>1;
		return (int)pieces%1000000007;
	}

}
