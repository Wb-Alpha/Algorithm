package CÓïÑÔÍøÀ¶ÇÅÁ·Ï°ÏµÍ³;

import java.util.Scanner;

public class _01Ä¸Å£µÄ¹ÊÊÂ_µİ¹é {
	public static void main(String[] args) {
		long[] year = new long[56];
		year[0] = 1;
		year[1] = 1;
		for (int i = 1; i <=55; i++) {
			if (i < 4) {
				year[i] = year[i-1]+year[0];
			}
			else {
				year[i] = year[i-1]+year[i-3];
			}
//			System.out.println(year[i]);
		}
		Scanner in = new Scanner(System.in);
		while(true) {
			int temp = in.nextInt();
			if (temp == 0) {
				break;
			}
			System.out.println(year[temp-1]);
		}
		in.close();
	}
}
