package a2019决赛;

// 求2019<X<Y ,使2019*2019,X*X,Y*Y组成等差数列且X+Y最小.

public class _01 {
	private static int sum;

	public static void main(String[] args) {
		for (int x = 0; x < 2019; x++) {
			for (int y = 0; y < x; y++) {
				if ((2019*2019-x*x) == (x*x-y*y)) {
					sum = x+y;
					System.out.println(x+" "+y+" "+sum);
					break;
				}
			}
		}
		
	}
}
