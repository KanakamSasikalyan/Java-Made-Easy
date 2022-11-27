import java.util.*;
import java.io.*;

public class Sum_of_N{
    public static void main (String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.print(n*(n+1)/2);
    }
}
