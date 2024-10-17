package capgemini;
import java.util.Scanner;
public class ReplaceCharactersOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string:");
		String str=sc.next();
		System.out.print("Enter the two character:");
		char ch1=sc.next().charAt(0);
		char ch2=sc.next().charAt(0);
		replaceCharacter(str,ch1,ch2);
	}
	public static void replaceCharacter(String str,char ch1,char ch2) {
		if(str==null || ch1==ch2 || (str.indexOf(ch2)==-1 && str.indexOf(ch1)==-1)) {
			return;
		}		
		String ans="";
		for(char ch:str.toCharArray()) {
			if(ch==ch1) {
				ans+=ch2;
			}else if(ch==ch2) {
				ans+=ch1;
			}else {
				ans+=ch;
			}
		}
		System.out.println("ans:"+ans);
	}

}
