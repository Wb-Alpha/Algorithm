package ��ʮһ�����ű�����ģ��;

import java.util.Scanner;

public class �ڶ����� {
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
