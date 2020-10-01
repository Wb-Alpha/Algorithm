package 练习系统;

import java.util.Scanner;

public class 一的个数 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int count = 0;
		for (int i = 1; i <= num; i++) {
			String temp = Integer.toString(i);
			String[] lst = temp.split("");
			for (int j = 0; j < lst.length; j++) {
				if (lst[j].equals("1")) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}
