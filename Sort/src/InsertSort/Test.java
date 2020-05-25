package InsertSort;

public class Test {
	public static void main(String[] args) {
		int[] a = {25,30,11,7,22,16,18,33,40,55};
		
		for (int i=0; i<a.length; i++) {
			for (int j = i; j>0; j--) {
				if (a[j] < a[j-1]) {
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
		
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
 