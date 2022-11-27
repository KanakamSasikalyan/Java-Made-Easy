import java.util.*;

public class Armstrong{
	public static boolean isArmstrong(int num){
		int sum = 0, temp = num;
		while(temp!=0){
			int rem = temp%10;
			sum+=rem*rem*rem;
			temp/=10;
		}
		return sum==num;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		
		for(int i=1;i<=range;i++){
			if(isArmstrong(i)){
				System.out.println(i+" ");
			}
		}
	}
}
