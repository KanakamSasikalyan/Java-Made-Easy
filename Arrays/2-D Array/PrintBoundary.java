import java.util.*;

public class PrintBoundary{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		//int n = sc.nextInt();
		
		int[][] mat = {{1,2,3,4},{5,6,7,8},{9,8,7,6},{5,4,3,2}};
		
		for(int i=0;i<4;i++){
			if(i==0||i==3){
				for(int j=0;j<4;j++){
					System.out.print(mat[i][j]+" ");
				}
			}
			else{
				for(int j=0;j<4;j++){
					if(j==0||j==3){
						System.out.print(mat[i][j]+" ");
					}
					else{
						System.out.print("  ");
					}
				}
			}
			System.out.println();
		}
	}
}
