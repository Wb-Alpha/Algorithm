package a2017年省赛;

import java.util.Scanner;

public class _09分巧克力 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[][] a = new int[n][2];
		int ans = 0;
		
		for (int i = 0; i < n; i++) {
			a[i][0] = in.nextInt();
			a[i][1] = in.nextInt();
		}
		
		for (int size = 1; size < 100000; size++) {
			int sum = 0;
			for (int i = 0; i < n; i++) {
				sum += (a[i][0]/size)*(a[i][1]/size);
			}
			if (sum < k) {
				ans = size-1;
				break;
			}
		}
		
		System.out.println(ans);
		in.close();
	}
}
