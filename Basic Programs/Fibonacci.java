import java.util.*;

class Fibonacci{
    public static void main (String[] args) {
        int a = 1, b =1,c=0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(a+" "+b+" ");
        for(int i=0;i<num-2;i++){
            c = a+b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
        System.out.println("\n"+c);
    }
}
