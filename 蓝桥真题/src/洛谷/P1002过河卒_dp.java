package 洛谷;

import java.util.Scanner;

public class P1002过河卒_dp {
	static int fx[] = {0, -2, -1, 1, 2, 2, 1, -1, -2};
	static int fy[] = {0, 1, 2, 2, 1, -1, -2, -2, -1};
	static int bx,by,mx,my;
	
	static long[][] f = new long[30][30];
	static boolean[][] s = new boolean[30][30];
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		bx = in.nextInt();
		by = in.nextInt();
		mx = in.nextInt();
		my = in.nextInt();
		bx += 2; by += 2; mx+=2; my+=2;
		
		f[2][2] = 1;	//初始化
		s[mx][my] = true;
		
		for (int i = 1; i <= 8; i++) {
			s[mx+fx[i]][my+fy[i]] = true;
		}
		
		for (int i = 2; i <= bx; i++) {
			for (int j = 2; j <= by; j++) {
				if (s[i][j]) continue;
				f[i][j] = Math.max(f[i][j], f[i-1][j]+f[i][j-1]);
			}
		}
		System.out.println(f[bx][by]);
		in.close();
	}
}
