package capgemini;
import java.util.Scanner;
public class MoveHashToFront {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string:");
		String str=sc.next();
		System.out.println("Move Hash To Front:"+moveHash(str));
	}
	public static String moveHash(String str) {
		StringBuilder ans=new StringBuilder();
		for(char ch:str.toCharArray()) {
			if(ch=='#') {
				ans.insert(0, ch);
			}else {
				ans.append(ch);
			}
		}
		return ans.toString();
	}

}
