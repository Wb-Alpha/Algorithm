package a2017年省赛;

public class _05取数位 {
	public static void main(String[] args) {
		int x = 234574;
		System.out.printf("%d\n", f(x,3));
	}
	
	public static int len(int x) {
		if (x < 10) return 1;
		return len(x/10)+1;
	}
	
	public static int f(int x, int k) {
		if (len(x)-k == 0) return x%10;
		return f(x/10, k--);
	}
	
}
