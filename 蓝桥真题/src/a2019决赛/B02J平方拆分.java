package a2019决赛;

public class B02J平方拆分 {
	static int ans = 0;
	public static void main(String[] args) {
		dfs(0, 45,2019);
		System.out.println(ans);
	}
	
	public static void dfs(int minn, int maxx, int num) {
		if (num < 0) return;
		if (num == 0) {
			ans++;
			return;
		}
		
		for (int i = minn; i < maxx; i++) {
			dfs(i+1, maxx, num-i*i);
		}
	}
}
