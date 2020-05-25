package tools;

public class tool {
	//交换函数
	public static void exch(Comparable[] a, int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	//判断大小函数
	public static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}
	
	public static void show(Comparable[] a) {
		for (int i=0; i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	//测试数组
	public static boolean isSort(Comparable[] a) {
		for (int i=1; i<a.length; i++) {
			if (less(a[i], a[i-1]))
				return false;
		}
		return true;
	}
}
