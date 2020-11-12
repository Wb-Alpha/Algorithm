package a2015决赛;

public class B01J分机号 {
	public static void main(String[] args) {
		int ans = 0;
		for (int i = 9; i >= 2; i--) {
			for (int j = i-1; j >= 1; j--) {
				for (int k = j-1; k >= 0; k--) {
					ans++;
					System.out.println(i+" "+j+" "+k);
				}
			}
		}
		System.out.println(ans);
	}
}
