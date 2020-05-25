package MergeSort;

public class TopToDown {
	
	private static Comparable[] aux; //�鲢����ĸ�������
	
	public static void sort(Comparable[] a) {
		aux = new Comparable[a.length];
		sort(a, 0, a.length-1);
	}
	
	private static void sort(Comparable[] a, int low, int high) {
		//������a[low...high]����
		if (high <= low) return;
		int mid = low + (high-low)/2;
		sort(a, low, mid);//����������
		sort(a, mid+1, high);//���Ұ������
		merge(a, low, mid, high);//�鲢���
	}
	
	public static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}
	
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
			else if (less(aux[j], aux[i]))
				a[k] = aux[j++];
			else
				a[k] = aux[i++];
		}
	}
	
	
	//ʾ��
	public static void main(String[] args) {
		Comparable[] a = {23,48,58,35};
		sort(a);
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
