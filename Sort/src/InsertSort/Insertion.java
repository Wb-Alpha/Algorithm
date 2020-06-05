package InsertSort;

public class Insertion {
	//实例
	public static void main(String[] args) {
		Comparable[]a = {35,64,15,74,92,54,14,64,27};
		sort(a);
		show(a);
	}
	
	public static void sort(Comparable[] a) {
		//将a[]按照升序排列
		int N = a.length;
		for (int i=1; i<N; i++) {
			//将a[i]插入到a[i-1],a[i-2],a[i-3].....中
			for (int j=i; j>0 && less(a[j],a[j-1]); j--)
				exch(a, j, j-1);
		}
	}
	
	//交换元素
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
