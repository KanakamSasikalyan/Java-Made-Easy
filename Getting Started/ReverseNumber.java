import java.util.*;
import java.io.*;

class Reverse{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String res = new StringBuilder(String.valueOf(num)).reverse().toString();
        int c = Integer.parseInt(res);
        System.out.print(c);
    }
}
