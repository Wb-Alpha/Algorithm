package 练习系统_算法提高;

import java.math.BigInteger;
import java.util.Scanner;

public class _05高精度除以高精度 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String stra = in.next();
		String strb = in.next();
		BigInteger a = new BigInteger(stra);
		BigInteger b = new BigInteger(strb);
		
		System.out.println(a.divide(b));
		
		in.close();
	}
}
