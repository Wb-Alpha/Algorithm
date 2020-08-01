package CircleSquare;

import java.util.*;

public class test1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double r = in.nextDouble();
		final double PI = Math.PI;
		double s = r*r*PI;
		System.out.println(String.format("%.7f", s));
	}
}
