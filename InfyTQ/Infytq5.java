
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

import java.util.*;
import java.io.*;
import java.lang.*;

public class Main
{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String otp="";
        for(int i=0;i<str.length();i++){
            if(i%2!=0){
                int c = Character.getNumericValue(str.charAt(i));
                int temp = c*c;
                otp += String.valueOf(temp);
            }
        }
        if(otp.length()>=4){
            System.out.println(otp.substring(0,4));
        }
        else{
            System.out.println(-1);
        }
    }
}
