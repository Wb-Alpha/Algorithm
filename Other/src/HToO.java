// 十六进制转八进制
import java.util.*;

public class HToO {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// int n = in.nextInt();
		// String[] r = new String[n];
		String temp = in.next();
		long f = Long.parseLong(temp,16);
		String d = Long.toString(f, 10);
		System.out.println(d);
		
		in.close();
	}
}
