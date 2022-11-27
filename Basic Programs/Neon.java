import java.util.*;

public class Neon{
	public static int checkNeon(int num){
		int sum = 0;
		while(num!=0){
			sum += num%10;
			num/=10;
		}
		return sum;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sqr = num*num;
		if(checkNeon(sqr)==num){
			System.out.println("Neon number");
		}else{
			System.out.println("Not neon number");
		}
	}
}
