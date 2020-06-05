package SelectionSort;

public class Selection {
	public static void main(String[] args) {
		Comparable[] a = {12,35,21,78,54,32,13,23};
		Sort(a);
		show(a);
	}
	
	public static void Sort(Comparable[] a) {
		//将数组a[]升序排列
		int N = a.length;
		for (int i=0; i<N; i++) {
			//将a[i]和a[i+1.....N]中的最小元素做交换
			int min = i;
			for (int j=i+1; j<N; j++)
				if (less(a[j],a[min])) min = j;
			exch(a, i, min);
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
