import java.util.*;
import java.io.*;
import java.lang.*;

public class UserInput{
	public static void main(String[] args)throws Exception{
		
		//Using BufferedReader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		
		//Using Scanner 
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
			
		//Using Console
		String str = System.console().readLine();
		
		System.out.println(a+" "+b+" "+str);
	}
}
		
