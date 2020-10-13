package a2015年省赛;

import java.util.Scanner;

public class _09垒骰子 {
	static int n,m;
	static int ans;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		n = in.nextInt();
		m = in.nextInt();
		int[][] a = new int[m][2];
		
		for (int i = 0; i < m; i++) {
			a[i][0] = in.nextInt();
			a[i][1] = in.nextInt();
		}
		in.close();
		
		ans = 0;
		f(n, 0, a);
		System.out.println(ans);
	}
	
	private static void f(int n, int lastTop, int[][] a) {
		if (n == 0) {
			ans++;
			ans = ans%1000000007;
			return;
		}
		
		int ban = 0;
		
		for (int i = 0; i < m; i++) {
			if (lastTop == a[i][0]) {
				ban = transform(a[i][1]);
			}
			else if (lastTop == a[i][0]) {
				ban = transform(a[i][1]);
			}
		}
		
		for (int i = 1; i < 7; i++) {
			if (i == ban) {
				continue;
			}
			
			for(int f = 0; f < 4; f++) {
				f(n-1, i, a);
			}	
		}
	}
	
	private static int transform(int i) {
		switch (i){
		case 1:
			return 4;
		case 4:
			return 1;
		case 3:
			return 6;
		case 6:
			return 3;
		case 2:
			return 5;
		case 5:
			return 2;
		}
		return 0;
	}
	

	
}
