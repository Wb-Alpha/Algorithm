package Training;

import java.util.*;

public class Interview {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		m = (int) (m*1.5);
		int[][] info = new int[n][2];
		
		for (int i=0; i<n; i++) {
			info[i][0] = in.nextInt();
			info[i][1] = in.nextInt();
		}
		info = sort(info);
		
		System.out.println(info[m][1]+" "+m);
		for(int i=0; i<m; i++) {
			System.out.println(info[i][0]+" "+info[i][1]);
		}
		
		in.close();
	}
	
	public static int[][] sort(int[][] a) {
		for (int i=0; i<a.length; i++) {
			for (int j = i; j>0; j--) {
				if (a[j][1] < a[j-1][1]) {
					int t = a[i][0];
					a[i][0] = a[j][0];
					a[j][0] = t;
					t = a[i][1];
					a[i][1] = a[j][1];
					a[j][1] = t;
				}
				/*
				else if (a[j][1] == a[j-1][1]) {
					if ( a[j][0] < a[j-1][0] ) {
						int t = a[i][0];
						a[i][0] = a[j][0];
						a[j][0] = t;
						t = a[i][1];
						a[i][1] = a[j][1];
						a[j][1] = t;
					}
				}*/
			}
		}
		return a;
	}
	/*
	public static int[][] sort(int[][] a){
		return sort(a, 0, a.length);
	}
	
	public static int[][] sort(int[][]a, int low, int high){
		if (high <= low) return a;
		int j = partition(a, low, high);
		sort(a, low, j-1);
		sort(a, j, high);
		return a;
	}
	
	public static int partition(int[][] a, int low, int high) {
		int i=low, j=high+1;
		int v = a[low][1];
		
		while(true) {
			while (less(a[++i][1], v))
				if (i == high) break;
			while(less(v,a[--j][1]))
				if (j == low) break;
			if (i >= j) break;
			exch( a, i, j);

		}
		exch(a, low, j);
		return j;
	}
	
	public static void exch(int[][] a, int i, int j) {
		int t = a[i][0];
		a[i][0] = a[j][0];
		a[j][0] = t;
		t = a[i][1];
		a[i][1] = a[j][1];
		a[j][1] = t;
	}
	
	public static boolean less(int v, int w) {
		return v<w;
	}*/
}
