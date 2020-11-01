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
	
	public static void f(int[] a, int index) {
		if (index >= a.length-1) {
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]+" ");
			}
			System.out.println();
			compare(a);
			return;
		}
		else {
			for (int i = index; i < a.length; i++) {
				swap(a, i, index);
				f(a, index+1);
				swap(a, i, index);
			}
		}
		
	}
	
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void compare(int[] a) {
		int suma = 0;
		int sumb = 0;
		for (int i = 1; i < a.length; i++) {
			for (int j = 0; j < i; j++) {
				suma = suma*10+a[j];
			}
			for (int j = i; j < a.length; j++) {
				sumb = sumb*10+a[j];
			}
			if (suma*sumb > max) {
				max = suma*sumb;
			}
		}
	}
}
