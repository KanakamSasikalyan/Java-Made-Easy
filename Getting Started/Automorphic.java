import java.util.*;

public class Automorphic{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sqr = num*num;
        boolean isAutomorphic = true;
        while(num > 0){
            if(num%10!=sqr%10)
                isAutomorphic = false;
            num /= 10;
            sqr /=10;
        }
        System.out.print(isAutomorphic);
    }
}
