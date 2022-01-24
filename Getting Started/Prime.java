
import java.util.*;
import java.io.*;
import java.lang.*;

public class Prime{
    static boolean isPrime(int num){
        for(int i=2;i<=(int)Math.sqrt(num);i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String res = (isPrime(num))?"yes":"no";
        System.out.print(res);
    }
}
