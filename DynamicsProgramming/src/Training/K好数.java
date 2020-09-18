package Training;

import java.util.*;


//https://blog.csdn.net/qq_41714549/article/details/87435089
public class KºÃÊı {
	final int MOD=1000000007;
	public static void main(String[] args) {
		int sum = 0;	
		
	}
	
	int countK(int length, int range, int sum) {
		int[][] dp = new int[1000][1000];
		for (int i=0; i<range; i++) {
			dp[0][i]=1;
		}
		
		for (int i=1; i<length; i++) {
			for (int j=0; j<range; j++) {
				for (int k=0; k<range; k++) {
					if ((j-1)==0 && k==0)
						continue;
					dp[i][j] = dp[i][j]+dp[i-1][k];
					dp[i][j] %= MOD;
				}
			}
		}
		
		for (int i=0; i<range; i++) {
			sum += dp[length-1][i];
			sum %= MOD;
		}
		
		return sum;
	}
}