package a2017年省赛;

import java.util.Scanner;

public class _k倍区间 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] a = new int[n];
		int ans = 0;
		
		for (int size = 1; size < a.length-1; size++) {
			for (int start = 0; start < a.length-1-size; start++) {
				int sum = 0;
				for (int index = start; index < start+size; index++) {
					sum = sum+a[index];
				}
				if (sum%k == 0) {
					ans++;
				}
			}
		}
		System.out.println(ans);
		
		in.close();
	}
}
