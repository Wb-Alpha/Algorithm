package Fibonacci;

import java.util.Scanner;

public class RecursoinmAjorization {
	public static void main(String[] args) {
		System.out.println("ÇëÊäÈëÊı×Ö");
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		System.out.println(fib(N));
		in.close();
	}
	
	public static int fib(int n) {
		if (n == 2 || n == 1)
			return 1;
		int prev = 1, curr = 1;
		for (int i=3; i<=n; i++) {
			int sum = prev+curr;
			prev = curr;
			curr = sum;
		}
		
		return curr;
	}
}
