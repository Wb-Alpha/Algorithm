package ��ϰϵͳ;

import java.util.Scanner;

public class ��Сдת�� {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		char[] lst = str.toCharArray();
		int temp;
		
		for (int i = 0; i < lst.length; i++) {
			temp = (int)lst[i];
			if (temp < 97) {
				temp = temp +32;
			}
			else
				temp = temp-32;
			System.out.print((char)temp);
		}
		in.close();
	} 
}
