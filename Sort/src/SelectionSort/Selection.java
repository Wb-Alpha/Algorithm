package SelectionSort;

public class Selection {
	public static void main(String[] args) {
		Comparable[] a = {12,35,21,78,54,32,13,23};
		Sort(a);
		show(a);
	}
	
	public static void Sort(Comparable[] a) {
		//������a[]��������
		int N = a.length;
		for (int i=0; i<N; i++) {
			//��a[i]��a[i+1.....N]�е���СԪ��������
			int min = i;
			for (int j=i+1; j<N; j++)
				if (less(a[j],a[min])) min = j;
			exch(a, i, min);
		}
	}
	
	//����Ԫ��
	public static void exch(Comparable[] a, int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	//չʾ����Ԫ��
	private static void show(Comparable[] a) {
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	//�Ա������С(���v<w�򷵻�true)
	private static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}
	
}
