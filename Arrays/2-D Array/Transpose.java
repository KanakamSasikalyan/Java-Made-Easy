import java.util.*;

public class Transpose{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		int[][] trs = new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				mat[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				trs[i][j]=mat[j][i];
			}
		}


		for(int i=0;i<m;i++){
                        for(int j=0;j<n;j++){
                                System.out.print(trs[i][j]+" ");
                        }
			System.out.println();
                }

	}
}
