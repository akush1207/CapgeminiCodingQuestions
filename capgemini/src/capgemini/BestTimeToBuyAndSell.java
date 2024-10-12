package capgemini;
import java.util.Scanner;
public class BestTimeToBuyAndSell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no. of days:");
		int days=sc.nextInt();
		int[] prices=new int[days];
		System.out.print("Enter the each day's price:");
		for(int i=0;i<days;i++) {
			prices[i]=sc.nextInt();
		}
		System.out.println("Max Profit:"+buyAndSell(prices));
	}
	public static int buyAndSell(int[] prices) {
		int maxProfit=0,minPrice=Integer.MAX_VALUE;
		for(int price:prices) {
			minPrice=Math.min(price, minPrice);
			maxProfit=Math.max(maxProfit, price-minPrice);
		}
		return maxProfit;
	}

}
