import java.util.*;
import java.io.*;

class Leap{
    public static void main (String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());
        String res = ((year%4==0&&year%100!=0)||year%400==0)?"leap":"notleap";
        System.out.print(res);
    }
}
