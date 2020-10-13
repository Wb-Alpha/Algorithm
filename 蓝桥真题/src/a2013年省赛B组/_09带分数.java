package a2013年省赛B组;

import java.util.Scanner;

public class _09带分数 {
	static int ans;
	static int target;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = {1,2,3,4,5,6,7,8,9};
		// int[] arr = {1,2,3};
		in.close();
		ans = 0;
		f(0, arr);
	}
	
	public static void f(int k, int[] a) {
		if (k==a.length-1) {
			check(a);
//			for(int i = 0; i < a.length; i++) {
//				System.out.print(a[i]+" ");
//			}
//			System.out.println();
			return;
		}
		
		for (int i = k; i < a.length; i++) {
			a = swap(a, i, k);
			f(k+1, a);
			a = swap(a, i, k);
		}
		
		
	}
	
	public static void check(int[] a) {
		for(int i = 1; i < 7; i++) {
			int num1 = toInt(a, 0, i);
			if(num1 > target) {
				continue;
			}
			for (int j = 1; j < 8-i; j++) {
				int num2 = toInt(a, i, j);
				int num3 = toInt(a, i+j, a.length-i-j);
				if (num2%num3 == 0) {
					if (num1+num2/num3 == target) {
						ans++;
					}
				}
			}
		}
	}
	
	private static int toInt(int[] a, int pos, int len) {
		// TODO Auto-generated method stub
		int t = 1;
		for (int i = pos+len; i >= pos; i++) {
			ans += a[i]*t;
			t *=10;
		}
		return ans;
	}

	public static int[] swap(int[] a,int i, int j) {
		int temp = a[i];
		a[i] = a[j]; 
		a[j] = temp;
		return a;
	}
}
