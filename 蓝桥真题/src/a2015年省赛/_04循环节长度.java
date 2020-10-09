package a2015年省赛;

import java.util.Vector;

public class _04循环节长度 {
	public static void main(String[] args) {
		int a = f(11, 13);
	}
	
	public static int f(int n, int m) {
		n = n%m;
		Vector v = new Vector();
		
		for(;;) {
			v.add(n);
			n *= 10;
			n = n % m;
			if (n == 0) return 0;
			if (v.indexOf(n) >= 0) {
				return v.size() - v.indexOf(n);
			}
		}
	}
}
