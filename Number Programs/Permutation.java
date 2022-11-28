import java.util.*;
import java.lang.*;
import java.io.*;

public class Permutation{
    static int fact(int n){
        if(n==0||n==1)
            return 1;
        return n*fact(n-1);
    }
    public static void main (String[] args) {
        /* code */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int res = (fact(n))/(fact(n-r));
        System.out.println(res);
    }
}
