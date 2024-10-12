package capgemini;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class FrequencyOfAllElementInArray {

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
		frequency(arr);
	}
	public static void frequency(int[] arr) {
		Map<Integer,Integer> map=new HashMap<>();
		for(int a:arr) {
			map.put(a, map.getOrDefault(a, 0)+1);
		}
		for(Map.Entry<Integer, Integer> mp:map.entrySet()) {
			System.out.println(mp.getKey()+" is present "+mp.getValue()+" time"+(mp.getValue()>1?"s.":"."));
		}
	}

}
