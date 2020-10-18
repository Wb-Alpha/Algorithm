package a2017年省赛;

import java.util.Arrays;
import java.util.Scanner;

public class _03承压计算 {
	static double[][] a;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		a = new double[30][30];
		for (int i = 0; i < 29; i++) {
			for (int j = 0; j <= i; j++) {
				a[i][j] = in.nextDouble();
			}
		}
		for (int i = 0; i < 30; i++) {
			a[29][i] = 0;
		}
		
		for (int i = 0; i < 29; i++) {
			for (int j = 0; j <= i; j++) {
				a[i+1][j] += a[i][j]/2;
				a[i+1][j+1] += a[i][j]/2;
			}
		}
		
		double[] ans = new double[30];
		
		for (int i = 0; i < 30; i++) {
			ans[i] = a[29][i];	
		}
		
		Arrays.sort(ans);
		
		for (int i = 0; i < 30; i++) {
			System.out.print(ans[i]+" ");	
		}
		System.out.println();
		System.out.println(2086458231.0/ans[0]*ans[29] );
		in.close();
	}
}	
