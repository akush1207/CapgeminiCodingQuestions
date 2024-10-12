package capgemini;
import java.util.Scanner;
public class MakeSingleDigitNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		System.out.println("Single Number:"+makeSingle(num));
	}
	public static int makeSingle(int num) {
		while(num>=10) {
			if(num%2==0) {
				num=(int)Math.floor((num-2)>>1);
			}else {
				num=(int)Math.floor(num>>1);
			}
		}
		return num;
	}

}
