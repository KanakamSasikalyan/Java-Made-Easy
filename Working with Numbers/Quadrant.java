import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
    public static void main (String[] args) throws Exception{
        /* code */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        if(x > 0 && y > 0){
            System.out.print("Quadrant-1");
        }
        else if(x < 0 && y > 0){
            System.out.print("Quadrant-2");
        }
        else if(x < 0 && y < 0){
            System.out.print("Quadrant-3");
        }
        else if(x > 0 && y < 0){
            System.out.print("Quadrant-4");
        }
        else{
            System.out.println("Invalid Points");
        }
    }
}
