package ��ϰϵͳ_�����⼯;

import java.util.Scanner;

public class _01���ҵ����� {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int ans = 1;
		while (true) {
			int a_mod = ans%a;
			int b_mod = ans%b;
			int c_mod = ans%c;
			if (a_mod==0 && b_mod==0 && c_mod==0) {
				break;
			}
			ans++;
		}
		System.out.println(ans);
		in.close();
	}
}
