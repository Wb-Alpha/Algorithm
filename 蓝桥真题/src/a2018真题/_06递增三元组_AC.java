package a2018真题;

import java.util.Scanner;

public class _06递增三元组_AC {
	static final int SIZE = 10001;
	static int[] a;
	static int[] b;
	static int[] c;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		a = new int[N];
		b = new int[N];
		c = new int[N];
		
		for (int i = 0; i < N; i++) {
			a[i] = in.nextInt();
		}
		
		for (int i = 0; i < N; i++) {
			b[i] = in.nextInt();
		}
		for (int i = 0; i < N; i++) {
			c[i] = in.nextInt();
		}
		in.close();
	}
}
