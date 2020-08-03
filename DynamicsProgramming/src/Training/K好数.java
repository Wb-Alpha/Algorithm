package Training;

import java.util.*;

public class KºÃÊý {
	static long result;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		int l = in.nextInt();
		result = 1;
		judgeK(k, l, l);
		result %= 1000000007;
		System.out.println(result);
	}
	
	public static void judgeK(int k, int l,int check) {
		if (l != 0) {
			if (l == check) {
				result = result*(k-1);
				l--;
				judgeK(k, l, check);
			}
			
			else {
				result = result + (long)((k-2)*(k-2)) + (long)(2*(k-1));
				l--;
				judgeK(k ,l ,check);
			}
		}
	}
}
