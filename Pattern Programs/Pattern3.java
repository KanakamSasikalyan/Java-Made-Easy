import java.util.*;

public class Pyramid{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++){
			int spaces = 2*n-i;
			int j = 2*i-1;
			int k = i;
			for(int p = 1;p<=spaces;p++){
				System.out.print(" ");
			}
			for(int q=1;q<=j;q++){
				if(q<=(j/2)){
					System.out.print(k);
					k++;
				}
				else{
					System.out.print(k);
					k--;
				}
			}
			System.out.println();
		}
	}
}
