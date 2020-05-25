package MergeSort;

public class TopToDown {
	
	private static Comparable[] aux; //归并所需的辅助数组
	
	public static void sort(Comparable[] a) {
		aux = new Comparable[a.length];
		sort(a, 0, a.length-1);
	}
	
	private static void sort(Comparable[] a, int low, int high) {
		//将数组a[low...high]排序
		if (high <= low) return;
		int mid = low + (high-low)/2;
		sort(a, low, mid);//将左半边排序
		sort(a, mid+1, high);//将右半边排序
		merge(a, low, mid, high);//归并结果
	}
	
	public static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}
	
	public static void merge(Comparable[] a, int low, int mid, int high) {
		//将a[low...mid]归并
		int i = low, j = mid+1;
		
		for (int k=low; k<=high; k++) {//将a[low...high]复制到aux[low...high]中
			aux[k] = a[k];
		}
		
		for (int k = low; k <= high; k++) {
			if (i > mid)					
				a[k] = aux[j++];
			else if (j > high) 				
				a[k] = aux[i++]; 
			else if (less(aux[j], aux[i]))
				a[k] = aux[j++];
			else
				a[k] = aux[i++];
		}
	}
	
	
	//示例
	public static void main(String[] args) {
		Comparable[] a = {23,48,58,35};
		sort(a);
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
