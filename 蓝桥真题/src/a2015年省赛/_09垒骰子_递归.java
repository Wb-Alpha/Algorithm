package a2015年省赛;

import java.util.Scanner;

public class _09垒骰子_递归 {
	static int[] op;
	static boolean[][] conflict;
	static final int MOD = 1000000007;
	
	public static void main(String[] args) {
		op = new int[7];
		conflict = new boolean[7][7];
		init();		// 也可以使用转换函数
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		for (int i = 0; i < m; ++i) {
			int x = in.nextInt();
			int y = in.nextInt();
			conflict[x][y] = true;
			conflict[y][x] = true;
		}
		int ans = 0;
		for(int up = 1; up <= 6; ++up) {
			ans=(ans+4*f(up,n-1))%MOD;
		}
		System.out.println(ans);
	}
	
	public static int f(int up, int cnt) {
		int ans = 0;
		if (cnt == 0) {
			return 4;
		}
		for (int upp = 1; upp <= 6; ++upp) {
			if (conflict[op[up]][upp])
				continue;
			ans = (ans + f(upp, cnt-1))%MOD;
		}
		return ans;
	}
	
	public static void init() {
		op[1] = 4;
		op[4] = 1;
		op[2] = 5;
		op[5] = 2;
		op[3] = 6;
		op[6] = 3;
	}	
}
