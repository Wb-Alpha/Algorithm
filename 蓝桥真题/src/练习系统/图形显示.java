package ��ϰϵͳ;

import java.util.Scanner;

public class ͼ����ʾ {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for (int i=0; i < n; i++) {
			int num = n-i;
			for (int j = 0; j < num; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
