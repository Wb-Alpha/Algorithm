package a2013年省赛B组;

import java.math.BigDecimal;
import java.math.BigInteger;

public class _04黄金连分数 {
	public static void main(String[] args) {
		BigInteger a = BigInteger.ONE;
		BigInteger b = BigInteger.ONE;
		for (int i = 3; i < 100; i++) {
			BigInteger t = a;
			b = a.add(b);
			a = t;
		}
		System.out.println(new BigDecimal(a).divide(new BigDecimal(b)).ROUND_HALF_DOWN);
	}
}
