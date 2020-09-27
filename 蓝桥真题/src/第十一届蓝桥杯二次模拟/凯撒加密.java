package 第十一届蓝桥杯二次模拟;

import java.util.Scanner;

public class 凯撒加密 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		char[] lst = str.toCharArray();
		int temp;
		
		for (int i = 0; i < lst.length; i++) {
			temp = (int)lst[i]; 
			temp = temp+3;
			if ( temp > 122 ) {
				temp = temp-26;
			}
			System.out.print((char)temp);
		}
	}
}
