package a2018¾öÈü;

import java.util.Scanner;

public class _C05J {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		char[] a = str.toCharArray();
		int count = 0;
		
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] > a[j]) {
					char temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					count++;
				}
			}
		}
		System.out.println(count);
		in.close();
	}
}
