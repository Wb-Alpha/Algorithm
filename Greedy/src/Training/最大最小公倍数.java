package Training;

import java.util.*;


// 解法：https://blog.csdn.net/qq_36403227/article/details/88677874
public class 最大最小公倍数 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long n = in.nextInt();
		System.out.println(findMax(n));
	}
	
	public static long findMax(long n) {
		long res;
		if (n <= 2)
			return n;
		
		if (n%2 != 0)
			res = n *(n - 1) *(n - 2);
		
		else {
			if (n%3 != 0)
				res = n*(n-1)*(n-3);
			else
				res = (n-1)*(n-2)*(n-3);
		}
		return res;
	}
}
