package capgemini;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class SpiralMatrix {

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
		System.out.println("Matrix:"+Arrays.deepToString(matrix));
		System.out.println("Spiral Matrix:"+spiralMatrix(matrix,row,col));
	}
	public static ArrayList<Integer> spiralMatrix(int[][] matrix,int row,int col){
		ArrayList<Integer> ans=new ArrayList<>();
		int top=0,down=row-1,left=0,right=col-1;
		while(top<=down && left<=right) {
			for(int i=left;i<=right;i++) {
				ans.add(matrix[top][i]);
			}
			top++;
			for(int i=top;i<=down;i++) {
				ans.add(matrix[i][right]);
			}
			right--;
			if(top<=down) {
				for(int i=right;i>=left;i--) {
					ans.add(matrix[down][i]);
				}
			}
			down--;
			if(left<=right) {
				for(int i=down;i>=top;i--) {
					ans.add(matrix[i][left]);
				}
			}
			left++;
		}
		return ans;
	}
}
