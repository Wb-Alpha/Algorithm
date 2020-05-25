package FastSort;

import tools.tool;

public class Basic {
	public static void sort(Comparable[] a) {
		sort(a, 0, a.length);
	}
	
	public static void sort(Comparable[] a, int low, int high) {
		if ( high <= low ) return;
		int j = partition(a, low, high);
		sort(a, low, j-1);
		sort(a, j, high);
	}
	
	private static int partition(Comparable[] a, int low, int high) {
		//�������з�Ϊa[low...i-1],[i]��[i+1...high]
		int i = low, j = high+1;//����ɨ��ָ��
		Comparable v = a[low];	//�з�Ԫ��
		
		while (true) {
			//ɨ�����ң����ɨ���Ƿ�������ҽ���Ԫ��
			while (tool.less(a[++i], v))
				if (i == high) break;
			while (tool.less(v, a[--j]))
				if (j == low) break;
			if (i >= j) break;
			tool.exch(a, i, j);
		}
		
		tool.exch(a, low, j);	//��v=a[j]������ȷ��λ��
		return j;				//a[low...j-1] <= a[j] <= a[j+1...high]���
	}
}
