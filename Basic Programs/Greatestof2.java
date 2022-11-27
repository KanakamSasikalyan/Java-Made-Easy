import java.util.*;
import java.io.*;


public class Great{
    public static void main (String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        String res = (a > b)?"a":(a < b?"b":"equal");
        System.out.print(res);
    }
}
