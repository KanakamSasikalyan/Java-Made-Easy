import java.util.*;

public class MatAdd{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat1 = new int[m][n];
		int[][] mat2 = new int[m][n];
		int[][] res = new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				mat1[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<m;i++){
                        for(int j=0;j<n;j++){
                                mat2[i][j] = sc.nextInt();
                        }
                }

		for(int i=0;i<m;i++){
                        for(int j=0;j<n;j++){
                                res[i][j] = mat1[i][j]+mat2[i][j];
                        }
                }
		System.out.println("THE ADDITION OF TWO MATRICES IS:");

		for(int i=0;i<m;i++){
                        for(int j=0;j<n;j++){
                                System.out.print(res[i][j]+" ");
                        }
			System.out.println();
                }
	}
}
