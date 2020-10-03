package 练习系统;

import java.util.Scanner;

public class K好数_答案 {
	public static void main(String[] args) {
		int k,l,i,j,x;
		long sum = 0;
		Scanner in = new Scanner(System.in);
		k = in.nextInt();
		l = in.nextInt();
		int[][] dp = new int[500][105];
		
		for ( j = 0; j < k; ++j) {
			dp[1][j] = 1;
		}
		
		for ( i = 2; i <= l; ++i) {
			for (j = 0; j < k; ++j) {
				for (x = 0; x < k; x++) {
					if (x != j-1 && x != j+1) {
						dp[i][j] += dp[i-1][x];
						dp[i][j] %= 1000000007;
					}
				}
			}
		}
		
		for ( j = 1; j < k; ++j) {
			sum += dp[l][j];
			sum %= 1000000007;
		}
		
		System.out.println(sum);
	}
}
