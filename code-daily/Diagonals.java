/*
Program to print the Diagonals of a Matrix

Given a 2D square matrix, print the Principal and Secondary diagonals.

Examples :

Input: 
n=4 //means square matrix is of 4X4 type

1 2 3 4
4 3 2 1
7 8 9 6
6 5 4 3

Output:
Principal Diagonal: 1, 3, 9, 3
Secondary Diagonal: 4, 3, 8, 6
*/

import java.util.*;

public class Diagonals{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		List<Integer> primary = new ArrayList<Integer>();
		List<Integer> secondary = new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				mat[i][j] = sc.nextInt();
			}
		}
		
		int j = n-1;
		for(int i=0;i<n;i++){
			primary.add(mat[i][i]);
			secondary.add(mat[i][j--]);
		}
		System.out.println(primary);
		System.out.println(secondary);
	}
}
