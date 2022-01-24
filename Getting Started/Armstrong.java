import java.util.*;

public class Armstrong{
    static boolean isArmstrong(int num){
        int res=0,temp = num;
        while(num != 0){
            int rem = num%10;
            res += rem*rem*rem;
            num /= 10;
        }
        if(temp == res)
            return true;
        return false;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1;i<=num;i++){
            if(isArmstrong(i)){
                System.out.print(i+" ");
            }
        }
    }
}
