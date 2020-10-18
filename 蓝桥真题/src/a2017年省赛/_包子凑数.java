package a2017年省赛;

import java.util.Scanner;

public class _包子凑数 {
	static int n,g;
	static int[] a;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		a = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
			if (i == 1) g=a[i];
			else g = gcd(a[i], g);
		}
		
		if (g != 1) {
			System.out.println("INF\n");
		}
		in.close();
	}

	private static int gcd(int a, int b) {
		// TODO Auto-generated method stub
		if (b == 0) return a;
		return gcd(b, a%b);
	}
}
