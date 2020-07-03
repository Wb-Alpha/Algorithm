package longestCommSubQuence;

import java.util.Scanner;

public class Exp1 {
	public static void main(String[] args) {
		String str1 = "ACTCCTAG";
		String str2 = "CATTCAGC";
		System.out.println(lcsLength(str1, str2, str1.length(), str2.length()));
	}
	
	public static int lcsLength(String a, String b, int m, int n) {
		int[][] dp = new int[n+1][m+1];//创建数组
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= m; j++)
				if (a.charAt(i-1) == b.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1]+1;
				}
				else {
					dp[i][j] = dp[i-1][j] > dp[i][j-1] ? dp[i-1][j] : dp[i][j-1];
				}
					
		}
		return dp[n][m];
	}
}