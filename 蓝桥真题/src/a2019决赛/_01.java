package a2019����;

// ��2019<X<Y ,ʹ2019*2019,X*X,Y*Y��ɵȲ�������X+Y��С.

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
