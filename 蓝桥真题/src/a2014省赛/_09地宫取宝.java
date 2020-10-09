package a2014省赛;

import java.util.Scanner;

public class _09地宫取宝 {
	static int m,n,k;
	static int[][] arr;
	static int ans;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		m = in.nextInt();
		k = in.nextInt();
		
		arr = new int[n][m];
		ans = 0;
				
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		
		f(0, 0, 0, -1);
		System.out.println(ans);
	}
	
	public static void f(int x, int y, int num, int max) {
		if (x == m-1 && y == n) {
			if (num == k)
				ans++;
			else if (num == k-1 && max < arr[y][x])
				ans++;
			if (x==2 && y==1 && k==2)
				System.out.println("asd");
			return;
		}
		
		if (arr[x][y] > max) {			
			if (x+1 < n) 
				f(x+1, y, ++num, arr[x][y]);
			if (y+1 < m)
				f(x, y+1, ++num, arr[x][y]);
		}
		
		if (x+1 < n) 
			f(x+1, y, num, max);
		if (y+1 < m)
			f(x, y+1, num, max);
	}
}
