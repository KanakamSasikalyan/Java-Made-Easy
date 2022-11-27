import java.util.Scanner;

public class addBin{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int[] bin = new int[100];
		int i=0, carry = 0;
		
		while(a>0||b>0){
			bin[i++] = (a%10+b%10+carry)%2;
			carry = (a%10+b%10+carry)/2;
			a/=10;
			b/=10;
		}
		if(carry!=0){
			bin[i++] = carry;
		}
		System.out.println("The addition of two binary numbers is:");
		for(int k=i;k>=0;k--){
			System.out.print(bin[k]);
		}
	}
}
