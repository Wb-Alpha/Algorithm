package 练习系统;

import java.util.Scanner;

public class Anagrams问题 {
	static int[] arr;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		String b = in.nextLine();
		a.toLowerCase();
		b.toLowerCase();
		char[] char_a = a.toCharArray();
		char[] char_b = b.toCharArray();

		boolean first = judge(char_a);
		boolean second = judge(char_b);
		if ( first && second )
			System.out.println("Y");
		else {
			System.out.println("N");
		}
		in.close();
	}
	
	public static boolean judge(char[] a) {
		arr = new int[200];
		int temp = 0;
		
		for (int i = 0; i < a.length; i++) {
			arr[(int)a[i]]++;
		}
		
		for (int i = 97; i < 123; i++) {
			if (arr[i] != 0) {
				if (temp == 0) {
					temp = arr[i];
				}
				else {
					if (arr[i] != temp) {
						return false;
					}
				}
			}
		}
		return true;
	}
}
