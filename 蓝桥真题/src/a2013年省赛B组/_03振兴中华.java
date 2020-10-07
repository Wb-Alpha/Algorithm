package a2013年省赛B组;

// dfs深度优先搜索题
// 深度优先搜索三个问题
// 边界
// 重复
// 变化

public class _03振兴中华 {
	public static void main(String[] args) {
		System.out.println(f(0, 0));
	}
	
	private static int f(int i, int j) {
		if (i == 3 || j == 4) return 1;
		return f(i+1, j)+f(i, j+1);
	}
}
