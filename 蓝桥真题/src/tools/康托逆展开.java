package tools;

import java.util.Vector;

public class 康托逆展开 {
	static int[] f;
	static int x,num;
	
	void jie_cheng(int n ) {
		f[0] = f[1] = 1;
		for (int i = 2; i <= n; i++) {
			f[i] = f[i-1]*i;
		}
	}
	
	Vector<Character> vec; //需要排序的车
	public void rev_kongtuo(int k) {
		int n = vec.size(), len = 0;
		String ans = "";
		k--;
		
		for (int i = 1; i <= n; i++) {
			int t = k / f[n-i];
			k %= f[n-i];
			
		}
	}
	
}
