package a2018真题;

import java.util.Arrays;
import java.util.Scanner;

public class _06递增三元组 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] a = new int[N];
		int[] b = new int[N];
		int[] c = new int[N];
		
		for (int j = 0; j < N; j++) {
			a[j] = in.nextInt();
		}
		for (int j = 0; j < N; j++) {
			b[j] = in.nextInt();
		}
		for (int j = 0; j < N; j++) {
			c[j] = in.nextInt();
		}
		
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		
		int ans = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <b.length; j++) {
				for (int p = 0; p < c.length; p++) {
					if (a[i] < b[j] && b[j] < c[p]) {
						ans++;
					}
				}
			}
		}
		System.out.println(ans);
		in.close();
	}
}
