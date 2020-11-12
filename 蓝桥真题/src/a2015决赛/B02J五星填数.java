package a2015决赛;

public class B02J五星填数 {
	static int[] a = {1,2,3,4,5,6,7,8,9,10,11,12};
	static int ans = 0;
	
	public static void main(String[] args) {
		f(0, a.length-1);
		System.out.println(ans/10);
	}
	
	public static void f(int start, int end) {
		if (start == end) {
			if (check()) {
				ans++;
			}
		}
		
		for (int i = start; i <= end; i++) {
			{
			int temp = a[i];
			a[i] = a[start];
			a[start] = temp;
			}
			f(start+1, end);
			{
			int temp = a[i];
			a[i] = a[start];
			a[start] = temp;
			}
		}
		
	}
	
	public static boolean check() {
		if (a[1] + a[2] + a[3] + a[4] != 24)
			return false;
		if (a[0] + a[2] + a[5] + a[8] != 24)
			return false;
		if (a[0] + a[3] + a[6] + a[9] != 24)
			return false;
		if (a[1] + a[5] + a[7] + a[9] != 24)
			return false;
		if (a[4] + a[6] + a[7] + a[8] != 24)
			return false;
		return true;
	}
}
