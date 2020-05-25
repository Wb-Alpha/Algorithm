package coloringProblem;

import java.util.*;

public class Exp1 {
	static int n;//图的顶点数
	static int m;//可用颜色数
	static int [][]a;//图的邻接矩阵
	static int[] x;//当前解
	static long sum;//当前已找到的可m着色方案数
	
	public static void mCloloring(int mm) {
		//m = mm;//初始化顶点数
		sum = 0;
		backtrack(1);
	}
	
	private static void backtrack(int t) {
		if (t>n) {
			sum++;
			for (int i=1; i<=m; i++) {
				System.out.println(x[i]+" ");
			}
			System.out.println();
		}
		else {
			for (int i=1; i<=m; i++) {
				x[t]=i;
				if (ok(t))
					backtrack(t+1);
				x[t] = 0;
			}
		}
	}
	
	private static boolean ok(int k) {
		for(int j=1; j<=n; j++) {
			if (a[k][j]==1 && (x[j]==x[k]))
				return false;
		}
		return true;
	}
	
	public static void init() {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入有多少个节点");
		n = in.nextInt();
		a = new int[n][n];
		x = new int[n];
		System.out.println("请输入有多少种颜色");
		m = in.nextInt();
		System.out.println("请输入图的邻接矩阵（矩阵两个元素之间采用空格隔开)");
		for(int i=0; i<n; i++) {
			System.out.println("请输入第"+i+"行的临接矩阵");
			for (int j=0; j<n; j++) {
				a[i][j] = in.nextInt();
			}
		}
		mCloloring(m);
		System.out.println(sum);
		
	}
	
	public static void main(String[] args) {
		init();
	}
}
