import java.util.*;
import java.io.*;
import java.lang.*;

public class Dec_to_Bin{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String res = "";
        while(num != 0){
            int rem = num%2;
            res += String.valueOf(rem);
            num /= 2;
        }
        res = new StringBuilder(res).reverse().toString();
        System.out.print(res);
    }
}
