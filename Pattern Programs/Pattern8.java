import java.util.*;

public class Pattern8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = n;
		for(int i=1;i<=2*n;i++){
			int spaces = (i<n)?n-i:i-n;
			int j = (i<n)?i:r--;
			for(int p=1;p<=spaces;p++){
				System.out.print(" ");
			}
			for(int q=1;q<=j;q++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
