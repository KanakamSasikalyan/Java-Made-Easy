import java.util.*;

public class Trace{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				mat[i][j] = sc.nextInt();
			}
		}
		
		int trace = 0;
		for(int i=0;i<n;i++){
			trace+=mat[i][i];
		}
		System.out.println("The trace of the matrix is:"+trace);

	}
}
