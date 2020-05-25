package Training;

import java.util.Arrays;
import java.util.Scanner;

public class FastSortTrain {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] num = new int[N];
		for (int i=0; i<N; i++) {
			num[i] = in.nextInt();
		}
		
		Arrays.sort(num);
		
		for (int i=0; i<N; i++)
			System.out.print(num[i]+" ");
	}
	
	public static void sort(Comparable[] a) {
		sort(a, 0, a.length);
	}
	
	public static void sort(Comparable[] a, int low, int high) {
		if ( high <= low ) return;
		int j = partition(a, low, high);
		sort(a, low, j-1);
		sort(a, j, high);
	}
	
	private static int partition(Comparable[] a, int low, int high) {
		//将数组切分为a[low...i-1],[i]和[i+1...high]
		int i = low, j = high+1;//左右扫描指针
		Comparable v = a[low];	//切分元素
		
		while (true) {
			//扫描左右，检查扫描是否结束并且交换元素
			while (less(a[++i], v))
				if (i == high) break;
			while (less(v, a[--j]))
				if (j == low) break;
			if (i >= j) break;
			exch(a, i, j);
		}
		
		exch(a, low, j);	//将v=a[j]放入正确的位置
		return j;				//a[low...j-1] <= a[j] <= a[j+1...high]达成
	}
	
	public static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}
	
	public static void exch(Comparable[] a, int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
}
