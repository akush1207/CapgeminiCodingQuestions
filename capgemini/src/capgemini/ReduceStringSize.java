package capgemini;
import java.util.Scanner;
public class ReduceStringSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string:");
		String str=sc.next();
		System.out.println("str:"+reduceSize(str));
	}
	public static String reduceSize(String str) {
		String ans="";
		int count=1;
		for(int i=1;i<str.length();i++) {
			if(str.charAt(i)==str.charAt(i-1)) {
				count++;
			}else {
				ans+=str.charAt(i-1);
				if(count>1) {
					ans+=count;
				}
				count=1;
			}
		}
		ans+=str.charAt(str.length()-1);
		if(count>1) {
			ans+=count;
		}
		return ans;
	}

}
