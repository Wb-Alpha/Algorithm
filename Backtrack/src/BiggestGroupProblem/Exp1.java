package BiggestGroupProblem;

import java.util.*;

public class Exp1 {
	static int[] x;//当前解
	static int n;//图G的顶点数
	static int cn;//当前顶点数
	static int bestn;//当前最大顶点数
	static int[] bestx;//当前最优解
	static boolean[][] a;//图G的邻接矩阵
	
	public static int maxClique(int[] v) {
		x = new int[n+1];
		cn = 0;
		bestn = 0;
		bestx = v;
		backtrack(1);
		return bestn;
	}
	
	static void backtrack(int a) {
		if( a>n ) {//如果到达叶节点
			for(int j=1; j<=n; j++) 
				bestx[j] = x[j];
			bestn = cn;
			return;
		}
		int ok = 1;
	}
}
