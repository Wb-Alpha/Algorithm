package 第十一届蓝桥杯二次模拟;

import java.util.Scanner;

public class 螺旋矩阵 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n,m,r,c;
		n = in.nextInt();
		m = in.nextInt();
		r = in.nextInt();
		c = in.nextInt();
		in.close();
		
		int[][] a = new int[n][m];
		int t = 1;
		int up = 0;
		int right = a[0].length-1;
		int left = 0;
		int down = a.length-1;
		int target = n*m;
		
		while ( t < target ) {
			if ( left < right ) {
				a[up][left] = t;
				t++;
			}
		}
	}
}
