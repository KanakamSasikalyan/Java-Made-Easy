import java.util.*;
import java.io.*;
import java.lang.*;

public class Replace0by1{
    public static void main (String[] args) {
        /* code */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String temp = String.valueOf(num).replace("0","1");
        num = Integer.parseInt(temp);
        System.out.println(num);
    }
}
