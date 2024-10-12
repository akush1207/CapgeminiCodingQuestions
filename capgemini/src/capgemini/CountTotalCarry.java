package capgemini;
import java.util.Scanner;
public class CountTotalCarry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the 1st number:");
		int num1=sc.nextInt();
		System.out.print("Enter the 2nd number:");
		int num2=sc.nextInt();
		System.out.println("Total carry:"+totalCarry(num1,num2));
	}
	public static int totalCarry(int num1,int num2) {
		String n1=String.valueOf(num1);
		String n2=String.valueOf(num2);
		int i=n1.length()-1,j=n2.length()-1;
		int ans=0,carry=0;
		while(i>=0 || j>=0) {
			int digit1=i>=0?n1.charAt(i)-'0':0;
			int digit2=j>=0?n1.charAt(j)-'0':0;
			int sum=digit1+digit2+carry;
			carry=sum/10;
			if(carry!=0) {
				ans++;
			}
			i--;
			j--;
		}
		if(carry==1) {
			ans++;
		}
		return ans;
	}
}
