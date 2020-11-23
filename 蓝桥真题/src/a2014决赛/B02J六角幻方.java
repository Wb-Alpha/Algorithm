package a2014¾öÈü;

public class B02JÁù½Ç»Ã·½ {
	static int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
	
	public static void main(String[] args) {
		f(0, a.length-1);
	}
	
	public static void f(int start, int end) {
		// ¼ôÖ¦
		if (start == 4) {
			if (a[0] + a[1] + a[2] + a[3] != 38) {
				return;
			}
		}
		else if(start == 5) {
			if (15+a[0]+a[4] != 38)
				return;
		}
		else if(start == 9){
			if (a[4]+a[5]+a[6]+a[7]+a[8] != 38)
				return;
			if(10+a[3]+a[8] != 38)
				return;
		}
		else if(start == 10) {
			
		}
	}
}
