package a2017��ʡ��;

import java.util.Scanner;

public class _���Ӵ��� {
	static int n;
	static int[] a;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		a = new int[n];
		
		for (int i = 0; i < n; i++) {
			a[i] = in.nextInt();
		}
		in.close();
	}
}
