package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class example1{
	public static int rank(int key, int[] a) {
		//��������������
		int low = 0;
		int high = a.length - 1;
		while ( low <= high ) {
			//�����ҵļ�Ҫô�����ڣ�Ҫô�ض�����low��high֮��
			int mid = low + (high - low) / 2;
			if (key < a[mid])
				high = mid - 1;
			else if (key > a[mid])
				low = mid + 1;
			else
				return mid;
		}
		return -1;//������û�ж�Ӧ�����򷵻�-1
	}
	
	//����������
	public static void main(String[] args) throws Exception{
		int a[] = {1, 8, 12, 15, 16, 21, 30, 35, 39};
		
		Arrays.sort(a);//�������ɴ�С����
		
		int result = rank(30, a);
		if (result != -1)
			System.out.println(result);
		else
			System.out.println("�޴�Ԫ��");
		
		result = rank(20, a);
		if (result != -1)
			System.out.println(result);
		else
			System.out.println("�޴�Ԫ��");
		
		result = rank(10, a);
		if (result != -1)
			System.out.println(result);
		else
			for(int i=0; i<10; i++) {
				if (a[i] > 10) {
					System.out.println(a[i-1] + " "+ a[i]);
					break;
				}
			}
	}
}
