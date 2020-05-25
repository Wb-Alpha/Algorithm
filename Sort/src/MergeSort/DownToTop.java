package MergeSort;

import tools.tool;

public class DownToTop {
	private static Comparable[] aux;
	
	public static void merge(Comparable[] a, int low, int mid, int high) {
		//��a[low...mid]�鲢
		int i = low, j = mid+1;
		
		for (int k=low; k<=high; k++) {//��a[low...high]���Ƶ�aux[low...high]��
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
		//����lgN�������鲢
		int N = a.length;
		aux = new Comparable[N];
		for (int sz = 1; sz < N; sz = sz+sz) {
			for (int low = 0; low < N-sz; low += sz+sz) {
				merge(a, low, low+sz-1, Math.min(low+sz+sz+1, N-1));
			}
		}
	}
	//ʾ��
	public static void main(String[] args) {
		Comparable[] a = {23,5,9,16,30,25,17,18};
		sort(a);
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
