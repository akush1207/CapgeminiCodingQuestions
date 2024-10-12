package capgemini;
import java.util.Scanner;
public class FoodForRats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no. of rats:");
		int r=sc.nextInt();
		System.out.print("Enter the unit of food each rat consume:");
		int unit=sc.nextInt();
		System.out.print("Enter the no. of house:");
		int n=sc.nextInt();
		int[] units=new int[n];
		System.out.print("Enter the unit of foods stored in each house:");
		for(int i=0;i<n;i++) {
			units[i]=sc.nextInt();
		}
		System.out.println("Total no. of house required:"+food(units,r,unit,n));
	}
	public static int food(int[] units,int r,int unit,int n) {
		if(n==0) {
			return -1;
		}
		int totalFoodRequired=r*unit;
		int currFood=0;
		for(int i=0;i<n;i++) {
			currFood+=units[i];
			if(currFood>=totalFoodRequired) {
				return i+1;
			}
		}
		return 0;
	}

}
