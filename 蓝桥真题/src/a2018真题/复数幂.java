package a2018ÕæÌâ;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

public class ¸´ÊýÃÝ {
	public static void main(String[] args) throws IOException {
		BigDecimal a = new BigDecimal("2"), b = new BigDecimal("3"),
				c = new BigDecimal("2"), d = new BigDecimal("3");
		FileWriter file = new FileWriter("ans.txt");
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for (int i=1; i<n; i++) {
			BigDecimal t = c;
			c = a.multiply(c).subtract(b.multiply(d));
			d = b.multiply(t).add(a.multiply(d));
		}
		
		System.out.println(c+(d.compareTo(BigDecimal.ZERO)==-1?"":"+")+d+"i");
        in.close();
	}
}
