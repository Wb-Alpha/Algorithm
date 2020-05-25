package Match;

import java.util.Scanner;

public class Seventh {
	public static void main(String[] args) {
		int[] list = new int[1000001];
		int count = 9;
		list[0] = 0;
		for ( int i = 1; i <= 100000; i++) {
			if(i<10) {
				list[i] = list[i-1]+1;
			}
			else {
				count += judge(i);
				list[i] = count;
			}
		}
		
		Scanner reader = new Scanner(System.in);
		int code = reader.nextInt();
		System.out.println(list[code]);
	}
	
	public static int judge(int a) {
		String str = Integer.toString(a);
		String[] strarr = str.split("");
		for(int i = 1; i < strarr.length; i++) {
			if (Integer.parseInt(strarr[i]) < Integer.parseInt(strarr[i-1])) {
				return 0;
			}
		}
		return 1;
	}
}
