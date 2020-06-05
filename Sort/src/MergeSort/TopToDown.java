package MergeSort;

public class TopToDown {
	
	public static void main(String[] args) {
		Comparable[] a = {23,52,84,25,74,46,36,83,34};
		sort(a);
		show(a);
	}
	
	static Comparable[] aux;
	
	public static void merge(Comparable[] a, int low, int mid, int hi) {
		
		int i=low, j=mid+1;
		
		for (int k=low; k<=hi; k++) {
			aux[k] = a[k];
		} 
		
		for (int k=low; k<=hi; k++) {
			if (i > mid) a[k] = aux[j++];
			else if (j > hi) a[k] = aux[i++];
			else if (less(aux[j],aux[i])) a[k] = aux[j++];
			else a[k] = aux[i++];
		}
	}
	
	public static void sort(Comparable[] a) {
		aux = new Comparable[a.length];
		sort(a, 0, a.length-1);
	}
	
	public static void sort(Comparable[] a, int low, int hi) {
		if (hi <= low) return;
		int mid = low+(hi-low)/2;
		sort(a,low,mid);
		sort(a,mid+1,hi);
		merge(a, low, mid, hi);
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
