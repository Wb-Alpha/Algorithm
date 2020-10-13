package a2016年省赛;

public class _01煤球数目 {
	public static void main(String[] args) {
		int ans = 0;
		int plus = 0;
		int[] a = new int[101];
		
		for (int i = 1; i < 101; i++) {
			plus = i;
			a[i] = a[i-1]+plus;
		}
		
		
		for (int i = 1; i < 101; i++) {
			ans += a[i];
		}
		System.out.println(ans);
	}
}
