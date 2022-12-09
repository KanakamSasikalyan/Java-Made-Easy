/*
rite a Program to check whether a number is Abundant number or not.

Hint: An abundant number is a number for which the sum of its proper divisors is greater than the number itself.

Input & Output format:
Input consists of 1 integer.
If it is an Abundant number display “Abundant Number” or display “Not Abundant Number”.

Sample input: 12
Sample Output: Abundant Number

Explanation:

The divisors of 12 are 1, 2, 3, 4 and 6.
The sum of divisors of 12 is equal to 16.
12 < 16. Hence, 12 is an abundant number.
*/

import java.util.*;

public class Abundant{
	public static boolean isAbundant(int n){
		int sum=0;
		for(int i=1;i<n;i++){
			if(n%i==0){
				sum+=i;
			}
		}
		return sum>n;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Abundant? :"+isAbundant(n));
	}
}
