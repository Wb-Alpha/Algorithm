package 练习系统;

import java.util.Scanner;

//问题描述
//有一个n个结点m条边的有向图，请输出他的关联矩阵。
//输入格式
//第一行两个整数n、m，表示图中结点和边的数目。n<=100,m<=1000。
//接下来m行，每行两个整数a、b，表示图中有(a,b)边。
//注意图中可能含有重边，但不会有自环。

public class 关联矩阵 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[][] mat = new int[n][m];
		int start, end;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)
				mat[i][j] = 0;
		}
		
		for (int j = 0; j < m; j++) {
			start = in.nextInt();
			end = in.nextInt();
			mat[start-1][j] = 1;
			mat[end-1][j] = -1;
			
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)
				System.out.print(mat[i][j]+" ");
			System.out.println();
		}
	}
}
