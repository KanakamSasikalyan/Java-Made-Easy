import java.util.*;
import java.io.*;

public class Greatest{
    public static void main (String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        String res = (a > b && a > c)?"a":((b > a && b > c)?"b":"c");
        System.out.print(res);
    }
}
