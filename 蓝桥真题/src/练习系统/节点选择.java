package 练习系统;

import java.util.Scanner;

public class 节点选择 {
	private static int dp[][] = new int[10002][2];
	private static int tree[][] = new int[10002][300];
	
	// 构建树
	public static void createTree(int parent, int child) {
		int i = 0;
		while (tree[parent][i] != 0) {
			i++;
		}
		tree[parent][i] = child;
	}
	
	// 遍历
	public static void dfs(int child, int parent) {
		int child_1 = tree[child][0];
		for (int i = 0; child_1 != 0; i++) {
			child_1 = tree[child][i];
			dfs(child_1, child);
			System.out.println(child);
			dp[child][1] += dp[child_1][0];
			dp[child][0] += dp[child_1][1]>dp[child_1][0] ? dp[child_1][1]:dp[child_1][0];
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int root = 0;
		for (int i = 0; i < n; i++) {
			int x = in.nextInt();
			if (i == 0) {
				root = x;
			}
			dp[x][1] = x;
		}
		
		for (int i = 0; i < n-1; i++) {
			int parent = in.nextInt();
			int child = in.nextInt();
			createTree(parent, child);
		}
		
		dfs(root, 0);
		int max = dp[root][1]>dp[root][0] ? dp[root][1]:dp[root][0];
		in.close();
	}
}
