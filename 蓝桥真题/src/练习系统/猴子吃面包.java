package 练习系统;

import java.util.Scanner;

public class 猴子吃面包 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double[] a = {0,0,0,0,0,0};
		
		for (int i = 0; i < a.length; i++)
			a[i] = in.nextDouble();
		int p1 = in.nextInt();
		
		double time = a[3]/a[0] + a[4]/a[1] + a[5]/a[2];
		String p = "%."+ p1 + "f";
		System.out.println(String.format(p, time));
	}
}
