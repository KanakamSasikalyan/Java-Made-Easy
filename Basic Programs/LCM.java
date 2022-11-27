import java.util.*;

public class LCM{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int min = Math.min(a,b);
		int lcm = 0;
		for(int i=min;i<=a*b;i++){
			if(i%a==0&&i%b==0){
				lcm = i;
				break;
			}
		}
		System.out.println("The lcm is:"+lcm);
	}
}
