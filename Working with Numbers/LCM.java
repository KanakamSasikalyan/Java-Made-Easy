import java.util.*;
import java.io.*;
import java.lang.*;

public class LCM{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        int lcm = (n1>n2)?n1:n2;
        while(true){
            if(lcm%n1==0&&lcm%n2==0){
                break;
            }
            lcm++;
        }
        System.out.print(lcm);
    }
}
