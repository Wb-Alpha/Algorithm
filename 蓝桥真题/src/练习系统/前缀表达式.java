package ��ϰϵͳ;

import java.util.Scanner;

public class ǰ׺���ʽ {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String[] strlist = str.split(" ");
		int a = Integer.parseInt(strlist[1]);
		int b = Integer.parseInt(strlist[2]);
		
		switch (strlist[0]) {
			case "+":
				System.out.println(a+b);
				break;
			case "-":
				System.out.println(a-b);
				break;
			case "*":
				System.out.println(a*b);
				break;
			case "/":
				System.out.println(a/b);
				break;
		}		
	}
}
