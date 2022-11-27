import java.util.*;

public class Pattern1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = 0;		
		for(int i=1;i<=2*n;i++){
			int spaces = (i<=n)?(n-i):i-n;
			int star = (i<=n)?2*i-1:2*(n-spaces)-1;

			for(int j=1;j<=spaces;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
