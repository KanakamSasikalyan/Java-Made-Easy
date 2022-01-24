import java.util.*;

public class Friendly{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int fact1=0,fact2=0;
        for(int i=1;i<a;i++){
            if(a%i==0)
                fact1 += i;
        }
        for(int i=1;i<b;i++){
            if(b%i==0)
                fact2 += i;
        }
        if(fact2==a && fact1 == b)
            System.out.print(true);
        else
            System.out.print(false);
    }
}
