package QuickSort;

public class Quick {
	public static void main(String[] args) {
		Comparable[] a = {14,36,17,452,276,36,462,723,34};
		sort(a);
		show(a);
	}
	
	public static void sort(Comparable[] a) {
		sort(a, 0, a.length-1);
	}
	
	public static void sort(Comparable[] a, int lo, int hi) {
		if (hi <= lo) return;
		int j = partition(a, lo, hi);
		sort(a, lo, j-1);
		sort(a, j+1, hi);
	}
	
	public static int partition(Comparable[] a, int lo, int hi) {
		int i = lo, j = hi+1;
		Comparable v = a[lo];
		while (true) {
			while (less(a[++i], v)) if (i==hi) break;
			while (less(v, a[--j])) if (j==lo) break;
			if (i>=j) break;
			exch(a, i, j);
		};
		exch(a, lo, hi);
		return j;
	}
	
	public static void exch(Comparable[] a, int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	//展示数组元素
	private static void show(Comparable[] a) {
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	//对比数组大小(如果v<w则返回true)
	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}
}
