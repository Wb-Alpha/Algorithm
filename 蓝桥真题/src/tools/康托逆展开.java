package tools;

import java.util.Vector;

public class ������չ�� {
	static int[] f;
	static int x,num;
	
	void jie_cheng(int n ) {
		f[0] = f[1] = 1;
		for (int i = 2; i <= n; i++) {
			f[i] = f[i-1]*i;
		}
	}
	
	Vector<Character> vec; //��Ҫ����ĳ�
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
