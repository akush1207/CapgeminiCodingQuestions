package capgemini;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class RearrangeArrayElementBySign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter array length:");
		int len=sc.nextInt();
		int[] arr=new int[len];
		System.out.print("Enter array element:");
		for(int i=0;i<len;i++) {
			arr[i]=sc.nextInt();
		}
		//rearrangeWithOrder(arr,len);
		rearrangeWithoutOrder(arr,len);
		System.out.println("arr:"+Arrays.toString(arr));
	}
	public static void rearrangeWithOrder(int[] arr,int len) {
		ArrayList<Integer> positive=new ArrayList<>();
		ArrayList<Integer> negative=new ArrayList<>();
		for(int a:arr) {
			if(a>0) {
				positive.add(a);
			}else {
				negative.add(a);
			}
		}
		int ind=0;
		for(int i=0;i<positive.size();i++) {
			arr[ind]=positive.get(i);
			ind+=2;
		}
		ind=1;
		for(int i=0;i<negative.size();i++) {
			arr[ind]=negative.get(i);
			ind+=2;
		}
	}
	public static void rearrangeWithoutOrder(int[] arr,int len) {
		int i=0,j=len-1;
		while(i<=j) {
			if(arr[i]<0) {
				i++;
			}else if(arr[j]>=0) {
				j--;
			}else {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		System.out.println("arr1:"+Arrays.toString(arr));
		int pos=i,neg=0;
		while(pos<len && neg<pos && arr[neg]<0) {
			int temp=arr[neg];
			arr[neg]=arr[pos];
			arr[pos]=temp;
			pos++;
			neg+=2;
		}
	}

}
