package a2014省赛;

import java.util.Scanner;

public class _09地宫取宝_答案 {
	static int m,n,k;
	static int[][] arr;
	static int ans;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		k = in.nextInt();
		
		arr = new int[n][m];
		ans = 0;
				
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		
		f(0, 0, 0, -1);
		System.out.println(ans);
	}

	private static void f(int i, int j, int l, int o) {
		
		
	}
}
