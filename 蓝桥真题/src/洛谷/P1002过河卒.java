package Âå¹È;

import java.util.Scanner;

public class P1002¹ýºÓ×ä {
	static int a,b,end_x,end_y,sum;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		end_x = in.nextInt();
		end_y = in.nextInt();
		a = in.nextInt();
		b = in.nextInt();
		int[][] arr = {{a, b}, 
				{a+2, b+1},{a-2, b+1}, 
				{a+2, b-1},{a-2, b-1},
				{a+1, b+2},{a+1, b-2},
				{a-1, b+2},{a-1, b-2}};
		sum = 0;
		fun(0,0,arr);
		System.out.println(sum);
		in.close();
	}
	
	public static void fun(int x, int y, int[][] arr) {
		if (x == end_x && y == end_y) {
			sum++;
			return;
		}
		for (int i = 0; i < 9; i++) {
			if (x == arr[i][0] && y == arr[i][1]) {
				return;
			}
		}
		if (x > end_x || y > end_y)	return;
		
		fun(x+1, y, arr);
		fun(x, y+1, arr);
	}
}
