package ��ϰϵͳ_�㷨���;

public class _03ˮ�ɻ��� {
	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {
			int a = i/100;
			int b = (i%100)/10;
			int c = i%10;
			if (a*a*a+b*b*b+c*c*c == i) {
				System.out.println(i);
			}
		}
	}
}
