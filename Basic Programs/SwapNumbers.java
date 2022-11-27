import java.util.Scanner;

public class SwapNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Before Swap");
		System.out.println("a: "+a+"b: "+b);		
		a = a+b;
		b = a-b;
		a = a-b;
		
		/*
			Logic: 2
				a = a^b
				b = a^b
				a = a^b
			Logic 3: 
				int temp = a;
				a = b;
				b = temp;
		*/
		System.out.println("After swap");
		System.out.println("a: "+a+"b: "+b);
	}
}
