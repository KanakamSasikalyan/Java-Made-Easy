import java.util.*;

public class ReversePyramid{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
		for(int i=n;i>=0;i--){
			int spaces = n-i;
			int star = 2*n-2*spaces+1;
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
