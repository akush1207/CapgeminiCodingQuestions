package capgemini;
import java.util.Scanner;
public class NearestInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter num and m:");
		int num=sc.nextInt();
		int m=sc.nextInt();
		System.out.println("Nearest Integer:"+nearestInteger(num,m));
	}
	public static int nearestInteger(int num,int m) {
		int div=num/m;
		if((num-(div*m))<((m*(div+1)-num))) {
			return div*m;
		}else {
			return (div+1)*m;
		}
	}
}
