package a2015年省赛;

public class _07牌型总数_答案 {
	private static int ans;
	
	public static void main(String[] args) {
		f(0, 0);
		System.out.println(ans);
	}
	
	private static void f(int k, int cnt) {
		if (k > 13 || cnt > 13) return;
		if (k == 13 && cnt == 13) {
			ans++;
			return;
		}
		
		for(int i = 0; i < 5; i++) {
			f(k+1, cnt+i);
		}
	}
}
