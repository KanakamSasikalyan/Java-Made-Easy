import java.util.*;
import java.io.*;

public class Max_Handshakes{
    public static void main (String[] args) {
        /* code */
        Scanner sc = new Scanner(System.in);
        int people = sc.nextInt();
        int res = (people)*(people-1)/2;
        System.out.println(res);
    }
}
