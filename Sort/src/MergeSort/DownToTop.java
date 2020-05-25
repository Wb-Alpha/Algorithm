package MergeSort;

import tools.tool;

public class DownToTop {
	private static Comparable[] aux;
	
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
			else if (tool.less(aux[j], aux[i]))
				a[k] = aux[j++];
			else
				a[k] = aux[i++];
		}
	}
	
	
	public static void sort(Comparable[] a) {
		//进行lgN次两两归并
		int N = a.length;
		aux = new Comparable[N];
		for (int sz = 1; sz < N; sz = sz+sz) {
			for (int low = 0; low < N-sz; low += sz+sz) {
				merge(a, low, low+sz-1, Math.min(low+sz+sz+1, N-1));
			}
		}
	}
	//示例
	public static void main(String[] args) {
		Comparable[] a = {23,5,9,16,30,25,17,18};
		sort(a);
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
