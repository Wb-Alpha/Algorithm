package a2014决赛;

import java.util.Scanner;

public class B04J排列序数 {
	static int[] a;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int len = str.length();
		a = new int[len];
		
		for (int i = 0; i < len; i++) {
			a[i] = f(i);
		}
		
		int ans = fun(str);
		System.out.println(ans);
		in.close();
	}

	// 求序号
	private static int fun(String str) {
		int len = str.length();
		int n = 0;
		
		for (int i = 0; i < len; i++) {
			int tem = 0;
			char ch1 = str.charAt(i);
			for (int j = i+1; j < len; j++) {
				char ch2 = str.charAt(j);
				if (ch2 < ch1)
					tem++;
			}
			n += a[len-1-i]*tem;
		}
		return n;
	}

	// 求阶乘
	private static int f(int n) {
		if (n == 0) {
			return 1;
		}
		int sum = 1;
		for (int i = 1; i <= n; i++) {
			sum *= i;
		}
		return sum;
	}
}
