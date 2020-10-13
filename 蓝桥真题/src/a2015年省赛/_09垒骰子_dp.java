package a2015年省赛;

import java.util.Scanner;

public class _09垒骰子_dp {
	static int[][] dp;
	static int[] op;
	static boolean[][] conflict;
	static final int MOD = 1000000007;
	
	public static void main(String[] args) {
		op = new int[7];
		conflict = new boolean[7][7];
		
		init();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		
		for (int i = 0; i < m; ++i) {
			int a,b;
			a = in.nextInt();
			b = in.nextInt();
			conflict[a][b] = true;
			conflict[b][a] = true;
		}
		
		for (int j = 1; j <= 6; ++j) {
			dp[0][j] = 1;
		}
		
		int cur = 0;
		for (int level = 2; level <= n; level++) {
			cur = 1-cur;
			for (int j = 1; j <= 6; j++) {
				dp[cur][j] = 0;
				for (int i = 1; i <= 6; i++) {
					if (conflict[op[j]][i]) continue;
					dp[cur][j] = (dp[cur][j]+dp[1-cur][i]) % MOD;
				}
			}
		}
		
		int ans = 1;
		int tmp = 4;
		int p = n;
		
		in.close();
	}
	
	
	public static void init() {
		op[1] = 4;
		op[2] = 5;
		op[3] = 6;
		op[4] = 1;
		op[5] = 2;
		op[6] = 3;
	}
}
