import java.util.*;

public class HCF{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int hcf = 0;
		for(int i=1;i<=Math.max(a,b);i++){
			if(a%i==0&&b%i==0){
				hcf = i;
			}
		}
		
		System.out.println("The HCF:"+hcf);
		
		//Method 2
		
		while(a!=b){
			if(a>b){ a-=b;}
			else{b-=a;}
		}
		
		System.out.println("The HCF is:"+a);
	}
}
