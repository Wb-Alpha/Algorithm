package a2017�����;

public class _01ƽ��ʮλ�� {
	static long max = 0;
	
	public static void main(String[] args) {
		char[] a = {'0','1','2','3','4','5','6','7','8','9'};
		arrange(a,0,a.length);
		System.out.println(max);
	}
	

	//����
	public static void swap(char a[],int i,int j){
		char temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	// ȫ����
	public static void arrange(char[] a, int index, int length) {
		if (index>=length-1) {
			long temp = Long.parseLong(String.valueOf(a));
			if (temp > max) {
				if (Math.sqrt((double)temp)%1 == 0)
					max = temp;
			}
//			long temp =  Long.parseLong(a.toString());
//			System.out.println(temp);

				
		}
		else {
			for (int i = index; i < length; i++) {
				swap(a,index,i);
				arrange(a, index+1, length);
				swap(a,index,i);
			}
		}
	}
	
	// �������
	public static void output(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}


/*
 * ���⣺ƽ��ʮλ��
 * 
 * ��0~9��10�����ֲ��ظ�������©��������ɺܶ�10λ���֡� ������Ҳ�кܶ�ǡ����ƽ��������ĳ������ƽ������
 * 
 * ���磺1026753849������������С��һ��ƽ������
 * 
 * �����ҳ���������һ��ƽ�����Ƕ��٣�
 * 
 * ע�⣺����Ҫ�ύ����һ��10λ���֣���Ҫ��д�κζ������ݡ�
 */