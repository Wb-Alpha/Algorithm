package a2014省赛;

import java.util.Scanner;

public class _08分糖果 {
	// 程序仍有bug
	static int count;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		count = 0;
		
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		f(arr);
		System.out.println(count);
		in.close();
	}
	
	
	private static void f(int[] a) {	
		if (check(a))
			return;
		
		for (int i = 0; i < a.length; i++) {
			if (i == 0) {
				a[a.length-1] += a[i]/2;
				a[i] -= a[i]/2;
			}
			else {
				a[i-1] += a[i]/2;
				a[i] -= a[i]/2;
			}
			if (a[i]%2 != 0) {
				a[i]++;
				count++;
			}
		}
		f(a);
	}	

	
	public static boolean check(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[0] != a[i]) return false;
		}
		return true;
	}
}
