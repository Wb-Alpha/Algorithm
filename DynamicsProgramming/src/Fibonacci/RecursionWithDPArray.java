package Fibonacci;

import java.util.ArrayList;
import java.util.Scanner;

public class RecursionWithDPArray {
	
	public static void main(String[] args) {
		System.out.println("ÇëÊäÈëÊı×Ö");
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		System.out.println(fib(N));
		in.close();
	}
	
	public static int fib(int N) {
		ArrayList<Integer> dp = new ArrayList<Integer>(N+1);
		for (int i=0; i<=N; i++) 
			dp.add(0);
		dp.set(1, 1);
		dp.set(2, 1);
		for (int i=3; i <= N; i++) {
			dp.set(i, dp.get(i-1)+dp.get(i-2));
		}
			
		return dp.get(N);
	}
}
