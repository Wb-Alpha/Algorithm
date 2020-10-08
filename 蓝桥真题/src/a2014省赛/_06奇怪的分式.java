package a2014省赛;

public class _06奇怪的分式 {
	public static void main(String[] args) {
		int sum = 0;
		
		for (int a=1; a<10; a++) {
			for (int b=1; b<10; b++) {
				if (a == b) continue;
				for (int c=1; c<10; c++) {
					for (int d=1; d<10; d++) {
						int gcd1 = gcd(a*c, b*d);
						int gcd2 = gcd(a*10+c, b*10+d);
						
						if (a*c/gcd1==(a*10+c)/gcd2 && b*d/gcd1==(b*10+d)/gcd2) {
							sum++;
						}
					}
				}
			}
		}
		
		System.out.println(sum);
	}
	
	private static int gcd(int a, int b) {
		if (b == 0) return a;
		return gcd(b, a%b);
	}
}
