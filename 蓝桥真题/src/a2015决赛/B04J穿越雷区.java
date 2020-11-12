package a2015决赛;

import java.util.Scanner;

public class B04J穿越雷区 {
	static int[][] dir = {{0,-1}, {0,1}, {-1,0}, {1,0}};
	static int ans = Integer.MAX_VALUE;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[][] map = new String[n][n];
		int[][] visit = new int[n][n];
		
		int x = 0;
		int y = 0;
		
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				map[i][j] = in.next();
				if (map[i][j].equals("A")) {
					x = i;
					y = j;
				}
			}
		}
		
		dfs(map, visit, x, y, 0);
		System.out.println(ans);
		in.close();
	}

	private static void dfs(String[][] map, int[][] visit, int row, int col, int step) {
		if (map[row][col].equals("B")) {
			if (step < ans) {
				ans = step;
			}
			return;
		}
		
		visit[row][col] = 1;
		for (int i = 0; i < dir.length; i++) {
			int nextRow = row+dir[i][0];
			int nextCol = row+dir[i][1];
			if( nextRow <0 || nextRow >= map.length || nextCol < 0 || nextRow >= map.length) {
				dfs(map, visit, nextRow, nextCol, step+1);
			}
			visit[nextRow][nextCol] = 0;
		}
	}
}
