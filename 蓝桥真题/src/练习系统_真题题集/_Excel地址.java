package 练习系统_真题题集;

import java.math.BigInteger;
import java.util.Scanner;

public class _Excel地址 {
	static String ans;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		BigInteger a = new BigInteger(str);
		BigInteger index = new BigInteger("26");
		ans = "";
		
		while(a.compareTo(index) == 1) {
			f(a.mod(index));
			a = a.divide(index);
		}
		f(a.mod(index));
		System.out.println(ans);
		in.close();
	}
	private static void f(BigInteger mod) {
		// TODO Auto-generated method stub
		int temp = mod.intValue();
		switch (temp) {
		case 1:
			ans += "A";
			break;
		case 2:
			ans += "B";
			break;
		case 3:
			ans += "C";
			break;
		case 4:
			ans += "D";
			break;
		case 5:
			ans += "E";
			break;
		case 6:
			ans += "F";
			break;
		case 7:
			ans += "G";
			break;
		case 8:
			ans += "H";
			break;
		case 9:
			ans += "I";
			break;
		case 10:
			ans += "J";
			break;
		case 11:
			ans += "K";
			break;
		case 12:
			ans += "L";
			break;
		case 13:
			ans += "M";
			break;
		case 14:
			ans += "N";
			break;
		case 15:
			ans += "O";
			break;
		case 16:
			ans += "P";
			break;
		case 17:
			ans += "Q";
			break;
		case 18:
			ans += "R";
			break;
		case 19:
			ans += "S";
			break;
		case 20:
			ans += "T";
			break;
		case 21:
			ans += "U";
			break;
		case 22:
			ans += "V";
			break;
		case 23:
			ans += "W";
			break;
		case 24:
			ans += "X";
			break;
		case 25:
			ans += "Y";
			break;
		case 0:
			ans += "Z";
			break;
		}
	}
}
