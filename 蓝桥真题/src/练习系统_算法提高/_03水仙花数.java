package 练习系统_算法提高;

public class _03水仙花数 {
	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {
			int a = i/100;
			int b = (i%100)/10;
			int c = i%10;
			if (a*a*a+b*b*b+c*c*c == i) {
				System.out.println(i);
			}
		}
	}
}
