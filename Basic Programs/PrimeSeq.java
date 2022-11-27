import java.util.*;
import java.io*;
imoprt java.lang.*;

class PrimeSeq{
    static boolean isPrime(int num){
        
        for(int i=2;i<=(int)Math.sqrt(num);i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        for(int i=2;i<=range;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
}
