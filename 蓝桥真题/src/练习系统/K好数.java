package 练习系统;

import java.util.Scanner;

public class K好数 {
	static int index;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		int l = in.nextInt();
		index = 0;
		in.close();
	}
	
	public static void judge(int k, int l, int pre) {
		int count = 0;
		if ( index == l ) return;
		for (int i = 0; i < k; i++) {
			if ( i != pre-1 && i != pre+1) {
				count++;
			}
		}
	}
}
