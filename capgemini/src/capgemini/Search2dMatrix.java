package capgemini;
import java.util.Scanner;
public class Search2dMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter row and column of the matrix:");
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][] matrix=new int[row][col];
		System.out.print("Enter matrix elements:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		System.out.print("Enter the elements to be searched:");
		int ele=sc.nextInt();
		if(search(matrix,row,col,i)) {
			System.out.println(i+" is present in the matrix.");
		}else {
			System.out.println(i+" is not present in the matrix.");
		}
	}
	public static boolean search(int[][] matrix,int row,int col,int ele) {
		int low=0,high=row*col-1;
		while(low<=high) {
			int mid=(low+high)>>1;
			int i=mid/col,j=mid%col;
			if(matrix[i][j]==ele) {
				return true;
			}else if(matrix[i][j]>ele) {
				high=mid-1;
			}else {
				low=mid+1;
			}
		}
		return false;
	}

}
