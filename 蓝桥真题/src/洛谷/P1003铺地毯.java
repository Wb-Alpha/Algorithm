package Âå¹È;

import java.util.Scanner;

public class P1003ÆÌµØÌº {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] a = new int[n][4];
		for (int i = 0; i < n; i++) {
			a[i][0] = in.nextInt();
			a[i][1] = in.nextInt();
			a[i][2] = in.nextInt();
			a[i][3] = in.nextInt();
		}
		int x = in.nextInt();
		int y = in.nextInt();
		int ans = -1;
		
		for (int i = n-1; i >= 0; i--) {
			if (x <= a[i][0]+a[i][2] && y <= a[i][1]+a[i][3] && x >= a[i][0] && y >= a[i][1]) {
				ans = i+1;
				break;
			}
		}
		System.out.println(ans);
		in.close();
	}
	
}
