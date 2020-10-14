package a2017年省赛;

import java.util.Scanner;

public class _正则问题 {
	static String s;
	static int len;
	static int pos;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		s = in.nextLine();
		len = s.length();
		int ans = f();
		System.out.println(ans);
		in.close();
	}

	private static int f() {
		// TODO Auto-generated method stub
		int m = 0;	
		int temp = 0;	// 用来保存连续的数量
		while (pos < len) {
			if (s.charAt(pos)=='(') {
				pos++;
				temp += f();
			}
			else if (s.charAt(pos) == 'x') {
				pos++;
				temp++;
			}
			else if (s.charAt(pos) == '|') {
				pos++;
				m = Math.max(m, temp);
				temp = 0;
			}
			else if (s.charAt(pos) == ')') {
				pos++;
				m = Math.max(m, temp);
				return m;
			}
		}
		m = Math.max(m, temp);
		return m;
	}
}
