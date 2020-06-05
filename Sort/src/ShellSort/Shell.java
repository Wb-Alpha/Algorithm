package ShellSort;

public class Shell {
	
	//该算法仍有bug,不能得出正确输出
	public static void main(String[] args) {
		Comparable[] a = {452,423,642,578,157,261,643,173,347,946};
		sort(a);
		show(a);
	}
	
	public static void sort(Comparable[] a) {
		int N = a.length;
		int h = 1;
		while (h < N/3)
			h = 3*h+1; 	//1，4，13，14.....
		
		while (h>=1) {
			for (int i=h; i<N; i++) {
				for (int j=i; j>=h && less(a[j], a[j-h]); j-=h)
					exch(a, j, j-h);
				h = h/3;
			}
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
