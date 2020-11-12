package a2015决赛;

import java.util.Scanner;

public class B05J表格计算 {
	static String[][] map;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		map = new String[n][m];
		for (int i = 0; i <n; i++) {
			String temp = in.nextLine();
			String[] tmp = temp.split(" ");
			for (int j = 0; j < tmp.length; j++) {
				map[i][j] = tmp[j];
			}
		}
		
		
		in.close();
	}
	
	public static void f(int i, int j) {
		if (map[i][j].charAt(0) == 'S' || map[i][j].charAt(0) <= 'A') {
			String judge = map[i][j].substring(0, 3);
			
		}
		else {
			int a = Integer.parseInt(map[i][j]);
			
		}
	}
}
