package longestCommSubQuence;

import java.util.Scanner;

public class FindLCSQ {
	static int m,n;
	public static void main(String[] args) {
		char[] x = {'B', 'D', 'C', 'A', 'B', 'A'};
		char[] y = {'A', 'B', 'C', 'B', 'D', 'A', 'B'};
		int[][] b = new int[x.length+1][y.length+1];

		System.out.println(lcsLength(x, y, b));
	}
	
	public static int lcsLength(char[] x, char[] y, int[][] b) {
		int[][] c = new int[m][n];
		
		//≥ı ºªØ
		for (int i=0; i<=m; i++) c[i][0] = 0;
		for (int i=0; i<=n; i++) c[0][i] = 0;
		
		for (int i=1; i<=m; i++) {
			for (int j=1; j<=n; j++) {
				if (x[i] == y[j]) {
					c[i][j] = c[i-1][j-1]+1;
					b[i][j] = 1;
				}
				else {
					if (c[i-1][j] >= c[i][j-1]) {
						c[i][j] = c[i-1][j];
						b[i][j] = 2;
					}
					else {
						c[i][j] = c[i][j-1];
						b[i][j] = 3;
					}
				}
			}
		}
		return c[m][n];
	}
	
	
	public static void lcs(int i, int j, char[] x, int[][] b) {
		if (i==0 || j==0) return;
		if (b[i][j] == 1) {
			lcs(i-1, j-1, x, b);
			System.out.println(x[i]);
		}
		else if (b[i][j]==2) lcs(i-1, j, x, b);
		else lcs(i, j-1, x, b);
	}
}
