package ��ϰϵͳ;

import java.util.Scanner;

//��������
//��һ��n�����m���ߵ�����ͼ����������Ĺ�������
//�����ʽ
//��һ����������n��m����ʾͼ�н��ͱߵ���Ŀ��n<=100,m<=1000��
//������m�У�ÿ����������a��b����ʾͼ����(a,b)�ߡ�
//ע��ͼ�п��ܺ����رߣ����������Ի���

public class �������� {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[][] mat = new int[n][m];
		int start, end;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)
				mat[i][j] = 0;
		}
		
		for (int j = 0; j < m; j++) {
			start = in.nextInt();
			end = in.nextInt();
			mat[start-1][j] = 1;
			mat[end-1][j] = -1;
			
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)
				System.out.print(mat[i][j]+" ");
			System.out.println();
		}
	}
}
