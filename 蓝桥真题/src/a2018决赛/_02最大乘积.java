package a2018����;


//���⣺���˻�
//
//�� 1~9 ��9�����ֳַ����飬�м����˺ţ�
//�е�ʱ�����ǵĳ˻�Ҳֻ����1~9��9�����֣�����ÿ������ֻ����1�Ρ�
//
//���磺
//984672 * 351 = 345619872
//98751 * 3462 = 341875962
//9 * 87146325 = 784316925
//...
//
//�������ֹ��ɵ���ʽ���кܶ࣬���������������Щ��ʽ�У��˻�����Ƕ��٣�
//
//ע�⣬��Ҫ�ύ����һ����������ʾ�Ǹ����Ļ�����Ҫ��д�κζ�������ݡ�
//��ֻ�ύ�˻�����Ҫ�ύ������ʽ��

public class _02���˻� {
	static int max = 0;
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6,7,8,9};
		f(a, 0);
		System.out.println(max);
	}
	
	
	// ȫ����
	public static void f(int[] a, int index) {
		if (index >= a.length-1) {	// ���10�����ݶ��ź��˾ͽ���compare()����
			compare(a);
			return;
		}
		else {
			for (int i = index; i < a.length; i++) {
				swap(a, i, index);	
				f(a, index+1);
				swap(a, i, index);	// ���ݵ�ԭ��״̬
			}
		}
		
	}
	
	// ��������
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	
	//���������������źõ������в���˺�
	public static void compare(int[] a) {
		int sum_a = 0;
		int sum_b = 0;
		int temp = 0;
		for (int i = 1; i < a.length; i++) {	// �ڵ�i��λ�ò���˺�
			for (int j = 0; j < i; j++) {	// ������ǰi����ת��Ϊһ������a
				sum_a = sum_a*10+a[j];
			}
			for (int j = i; j < a.length; j++) {	//�������i��Ԫ��֮�����ת����һ������b
				sum_b = sum_b*10+a[j];
			}
			if (sum_a*sum_b > max) {
				boolean[] j = new boolean[10];
				for (int p = 0; p < a.length; p++) {
					j[a[p]] = true;
				}
				for (int p = 0; p < j.length; p++) {
					if (j[p] == false) {
						temp = 1;
						break;
					}	
				}
				if (temp != 1) {
					max = sum_a*sum_b;
				}			
			}
		}
	}
	
}
