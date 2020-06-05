package ShellSort;

public class Shell {
	
	//���㷨����bug,���ܵó���ȷ���
	public static void main(String[] args) {
		Comparable[] a = {452,423,642,578,157,261,643,173,347,946};
		sort(a);
		show(a);
	}
	
	public static void sort(Comparable[] a) {
		int N = a.length;
		int h = 1;
		while (h < N/3)
			h = 3*h+1; 	//1��4��13��14.....
		
		while (h>=1) {
			for (int i=h; i<N; i++) {
				for (int j=i; j>=h && less(a[j], a[j-h]); j-=h)
					exch(a, j, j-h);
				h = h/3;
			}
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
