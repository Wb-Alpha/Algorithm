package Training;

/*
 * ��һ����ʽ�Ļ�վ�Ա���һ���ţ�����������ƺ����ĵ��Ŷ�ˮƽ��ת��
 * һ����վ��ְ�������ŵĳ���������������ڳ��ᣬ���������ת180180�ȣ�
 * ����԰��������ڳ����λ�ý����������ַ��������������г����˳��
 * �������͸����������Ž���վ�ĳ��ᰴ����Ŵ�С�������С������ݺ�
 * ��վ��������һ�����Զ���������һ����Ҫ�Ĺ����Ǳ�һ�����������ʼ��
 * ����˳�򣬼��������ö��ٲ����ܽ���������
 */

import java.util.*;

public class Carriage_reorganization {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] a = new int[N];
		int count = 0;
		
		for (int i=0; i<N; i++) {
			a[i] = in.nextInt();
		}
		
		for(int i=1; i<a.length; i++) {
			for(int j=0; j<a.length-1; j++) {
				if ( a[j] > a[j+1] ) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					count++;
				}
			}
		}
		
		System.out.println(count);
	}
}
