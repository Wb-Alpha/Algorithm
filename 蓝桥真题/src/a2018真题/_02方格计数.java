package a2018真题;


public class _02方格计数 {
	static final int r = 1000;
	static int ans = 0;
	
	public static void main(String[] args) {
		for (int x = 1; x <= 1000; x++) {
			for (int y = 1; y <= 1000; y++) {
				if (x*x+y*y<=1000*1000) {
					ans++;
				}
			}
		}
		System.out.println(ans*4);
	}
}
