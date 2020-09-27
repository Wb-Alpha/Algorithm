package 练习系统;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 寻找数组中的最大值 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		List<Integer> arr = new ArrayList<Integer>();
		
		for (int i = 0; i < num; i++) {
			int temp = in.nextInt();
			arr.add(temp);
		}
		int max = Collections.max(arr);
		System.out.print(max + " " + arr.indexOf(max));
	}
}
