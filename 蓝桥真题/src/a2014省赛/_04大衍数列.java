package a2014省赛;

public class _04大衍数列 {
	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			if (i%2 == 0) {
				System.out.println(i*i/2);
			}
			else {
				System.out.println((i*i-1)/2);
			}
		}
	}
}
