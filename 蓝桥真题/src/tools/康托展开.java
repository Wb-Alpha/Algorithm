package tools;

import java.util.Scanner;

public class ¿µÍÐÕ¹¿ª {
	static int[] f = new int[20];
	
	public static void jie_cheng(int n) {
		f[1] = f[0] =1;
		for (int i = 2; i <= n; i++) {
			f[i] = f[i-1] * i;
		}
	}
	
	public static int kangtuo(String str1) {
		String str = str1;
		int ans = 1;
		int len = str.length();
		
		for (int i = 0; i < len; i++) {
			int tmp = 0;
			
			for (int j = i+1; j < len; j++) {
				if (str.indexOf(i) > str.indexOf(j))
					tmp++;
			}
			
			ans += tmp * f[len-i-1];
		}
		return ans;
	}
	
	public static void main(String[] args) {
		jie_cheng(10);
		Scanner in = new Scanner(System.in);
		String str = in.next();
		in.close();
		
		System.out.println(kangtuo(str));
	}
}
