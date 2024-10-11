package capgemini;
import java.util.Scanner;
public class MagicalNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		System.out.print("Magical Number's:");
		for(int i=1;i<=num;i++) {
			if(isMagical(i)) {
				System.out.print(i+" ");
			}
		}
	}
	public static boolean isMagical(int n) {
		int sum=0;
		while(n!=0) {
			if((n&1)==1) {
				sum+=2;
			}else {
				sum++;
			}
			n>>=1;
		}
		return sum%2!=0;
	}

}
