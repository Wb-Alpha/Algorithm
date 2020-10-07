package a2013年省赛B组;

import java.util.ArrayList;
import java.util.Scanner;

public class _07错误票据 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();	// 用于吃掉整数后面的换行符
		int l = 0;
		int min = Integer.MAX_VALUE;
		ArrayList<Integer> arr = new ArrayList<Integer>();
	
		for (int i = 0; i < n; i++) {
			String str = in.nextLine();
			String[] lst = str.split(" ");
			l = l+lst.length;
			for (int j = 0; j < lst.length; j++) {
				int temp = Integer.parseInt(lst[j]);
				if (temp < min)
					min = temp;
				arr.add(temp);
			}
		}
		
		int[] indexLst = new int[min+l];
		for (int i = 0; i < indexLst.length; i++) {
			indexLst[i] = 0;
		}
		
		for (int i : arr) {
			indexLst[i]++;
		}
		
		
		int a = 0,b = 0;
		for (int i = min; i < min+l; i++) {
			if (indexLst[i] == 0)
				a = i;
			else if (indexLst[i] == 2)
				b = i;
		}
		System.out.println(a+" "+b);
		in.close();
	}
}
