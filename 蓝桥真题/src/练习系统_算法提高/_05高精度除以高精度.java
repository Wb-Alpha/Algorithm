package ��ϰϵͳ_�㷨���;

import java.math.BigInteger;
import java.util.Scanner;

public class _05�߾��ȳ��Ը߾��� {
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
