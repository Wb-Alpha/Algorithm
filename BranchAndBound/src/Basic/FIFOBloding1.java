package Basic;

import java.util.*;

public class FIFOBloding1 {
	static int n;//�������װ������
	static int m;//�������
	static int[] weight;//��������
	static int[] value;//��ֵ����
	
	
	
	public static void main(String[] args) {
		init();
	}
	
	public static void init() {
		Scanner in = new Scanner(System.in);
		System.out.println("�����뱳�����װ��������");
		n = in.nextInt();
		System.out.println("��������������");
		m = in.nextInt();
		weight = new int[m];
		value = new int[m];
		
		System.out.println("�������������ļ�ֵ");
		for (int i=0; i<n; i++) {
			value[n] = in.nextInt();
		}
		System.out.println("������������������");
		for (int i=0; i<n; i++) {
			weight[i] = in.nextInt();
		}
		
	}
}
