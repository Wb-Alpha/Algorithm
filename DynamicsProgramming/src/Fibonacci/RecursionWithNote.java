package Fibonacci;

import java.util.ArrayList;
import java.util.Scanner;

public class RecursionWithNote {
	
	//����
	public static void main(String[] args) {
		System.out.println("����������");
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		System.out.println(fib(N));
	}
	
	public static int fib(int N) {
		if (N < 1) return 0;
		ArrayList<Integer> memo = new ArrayList<Integer>(N+1);
		for (int i=0; i<=N; i++)
			memo.add(0);
		return helper(memo, N);
	}

	private static int helper(ArrayList<Integer> memo, int n) {
		//base case
		if (n == 1|| n == 2) return 1;
		//�Ѿ��������
		if (memo.get(n) != 0) return memo.get(n);
		memo.set(n,  helper(memo, n-1)+helper(memo, n-2));
		return memo.get(n);
	}
}
