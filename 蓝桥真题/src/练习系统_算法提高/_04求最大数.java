package ��ϰϵͳ_�㷨���;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _04������� {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] a = new int[10];
		for (int i = 0; i < 10; i++) {
			a[i] = in.nextInt();
		}
		Arrays.sort(a);
		System.out.println(a[9]);
		in.close();
	}
}
