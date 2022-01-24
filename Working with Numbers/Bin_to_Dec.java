import java.util.*;
import java.io.*;
import java.lang.*;

public class Bin_to_Dec{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n=0;
        int decimal = 0;
        while(num != 0){
            int temp = num%10;
            decimal += temp*(int)Math.pow(2,n);
            num /= 10;
            n++;
        }
        System.out.print(decimal);
    }
}
