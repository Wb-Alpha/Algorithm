package a2015��ʡ��;

import java.util.Scanner;

public class _08���ϻ��� {
	private static int ans;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		ans = n;
		f(n);
		System.out.println(ans);
		in.close();
	}
	
	private static void f(int n) {
		if (n < 3)
			return;

		int add = n/3;
		n = n%3;
		n += add;
		ans += add;
		f(n);
	}
}
