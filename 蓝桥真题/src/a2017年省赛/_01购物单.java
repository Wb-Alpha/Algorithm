package a2017��ʡ��;

import java.util.Scanner;

public class _01���ﵥ {
	
	static double ans = 0;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			double a = in.nextDouble();
			double b = in.nextDouble();
			
			ans += (a*b)/100;
			if (a == 114514.0) {
				break;
			}
		}
		
		System.out.println(ans);
	}
}
