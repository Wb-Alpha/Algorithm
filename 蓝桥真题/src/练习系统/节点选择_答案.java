package ��ϰϵͳ;

import java.util.Scanner;
import java.util.Vector;

public class �ڵ�ѡ��_�� {
	static int[][] dp;
	public static void main(String[] args) {
		Vector<Vector> v = new Vector<Vector>();
		dp = new int[100010][2];
		int a,b,n;
		Scanner in = new Scanner(System.in);
		
		n = in.nextInt();
		for (int i = 0; i <= n; i++) {
			dp[i][1] = in.nextInt();
		}
		
	}
}
