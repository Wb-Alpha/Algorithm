package a2013决赛;

public class B02J连续奇数和_答案 {

	public static void main(String[] args) {
		int n = 111 * 111 * 111;
		int sum = 0;
		// 直接从1开始，枚举小于等于n的奇数相加
		for (int i = 1; i <= n; i += 2) {
			sum = 0;
			for (int j = i; j <= n; j += 2) {
				sum += j;
				if (sum > n)
					break;
				if (sum == n) {
					System.out.println(i);
					System.exit(0);
				}
			}
		}
		
		// 根据等差数列，an=2*n-1,Sn=n*n,根据这个来枚举
		for (int i = 1; i < 3000; i++) {
			for (int j = i; j < 3000; j++) {
				if (j * j - (i - 1) * (i - 1) == n) {
					System.out.println(2 * i - 1);
					System.exit(0);
				}
			}
		}
	}

}
