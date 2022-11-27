import java.util.*;
import java.io.*;
import java.lang.*;

public class PosorNeg{
    public static void main (String[] args) throws Exception{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int a = Integer.parseInt(br.readLine());
       String res = (a>0)?"+ve":"-ve";
       System.out.print(res);
    }
}
