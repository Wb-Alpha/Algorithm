package MergeSort;

public class DownToTop {
	//该算法仍有bug
	public static void main(String[] args) {
		Comparable[] a = {42,27,451,73,374,16,3,348,2};
		sort(a);
		show(a);
	}
	
	static Comparable[] aux;
	
	public static void sort(Comparable[] a) {
		int N = a.length;
		aux = new Comparable[N];
		for(int sz=1; sz < N; sz=sz+sz) {
			for (int lo=0; lo<N-sz; lo+=sz+sz)
				merge(a, lo, lo+sz+1, Math.min(lo+sz+sz-1, N-1));
		}
	}
	
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
