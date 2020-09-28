package 第十一届蓝桥杯二次模拟;

import java.util.Scanner;

public class 摆动序列 {
	static int m;
	static int[] a;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		m = in.nextInt();
		int n = in.nextInt();
		a = new int[n];
		
		for (int i = 1; i < n; i++) {
			a[i] = ++i;
		}
		
	}
	
	public void sort(int[] result, int font) {
		
	}
}
