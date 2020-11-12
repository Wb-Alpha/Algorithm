package a2013决赛;

import java.util.Scanner;

public class B05J格子刷油漆 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if (n == 1) {
			System.out.println(2);
		}
		else if ( n == 2 ) {
			System.out.println(24);
		}
		else {
			int[] a = new int[n];
			int[] b = new int[n];
			
			for (int i = 1; i < n; i++) {
				a[i] = 1;
				b[i] = 1;
			}
			a[1] = 6;
			b[1] = 2;
			for (int i = 2; i < n; i++) {
				b[i] = (2*b[i-1])%1000000007;
				a[i] = (2*a[i-1]+4*a[i-2]+b[i])%1000000007;
			}
			int ans = a[n-1]*4;
			for (int i = 1; i < n-1; i++) {
				ans = (ans+8*b[n-i-2]*a[i-1])%1000000007;
				ans = (ans+8*b[i-1]*a[n-i-2]%1000000007);
			}
			System.out.println(ans);
		}
		in.close();
	}
}
