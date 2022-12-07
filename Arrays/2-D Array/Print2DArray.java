import java.util.*;

public class Print2DArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] arr = new int[m][n];
		
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("The matrix is:");
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
