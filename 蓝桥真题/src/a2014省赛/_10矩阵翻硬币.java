package a2014Ê¡Èü;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class _10¾ØÕó·­Ó²±Ò {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.next();
		String s2 = in.next();
		System.out.println(sqrt(s1).multiply(sqrt(s2)));
		in.close();
	}

	private static BigInteger sqrt(String s1) {
		// TODO Auto-generated method stub
		int length = s1.length();
		int len = 0;
		if (length%2 == 0)
			len = length/2;
		else
			len = length/2+1;
		char[] sArr = new char[len];
		Arrays.fill(sArr, '0');
		
		BigInteger target = new BigInteger(s1);
		for(int pos = 0; pos < len; pos++) {
			for (char c = '1'; c <= '9'; c++) {
				sArr[pos] = c;
				BigInteger p = new BigInteger(String.valueOf(sArr)).pow(2);
				if (p.compareTo(target) == 1) {
					sArr[pos] -= 1;
					break;
				}
			}
		}
		return new BigInteger(String.valueOf(sArr));
	}
	
	
}
