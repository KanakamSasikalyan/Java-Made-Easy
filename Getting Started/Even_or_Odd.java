import java.util.*;
import java.io.*;
import java.lang.*;

public class Even_or_Odd{
    public static void main (String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        
        String res = (a%2==0)?"even":"odd";
        System.out.print(res);
    }
}
