/*
Write a Program to replace all 0’s with 1 in a given integer.

Given an integer as an input, all the 0’s in the number has to be replaced with 1.

For example, consider the following number

Input: 102405
Output: 112415

Input: 56004
Output: 56114
*/

import java.util.*;

public class Replace{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = String.valueOf(n);
		str = str.replace("0","1");
		System.out.println(Integer.parseInt(str));
	}
}
