package InsertSort;

public class Insertion {
	//ʵ��
	public static void main(String[] args) {
		Comparable[]a = {35,64,15,74,92,54,14,64,27};
		sort(a);
		show(a);
	}
	
	public static void sort(Comparable[] a) {
		//��a[]������������
		int N = a.length;
		for (int i=1; i<N; i++) {
			//��a[i]���뵽a[i-1],a[i-2],a[i-3].....��
			for (int j=i; j>0 && less(a[j],a[j-1]); j--)
				exch(a, j, j-1);
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
