package BubbleSort;
//ц╟ещеепР

public class Test1 {
	public static void main(String[] args) {
		int[] a = {25,30,11,7,22,16,18,33,40,55};
		
		for(int i=1; i<a.length; i++) {
			for(int j=0; j<a.length-1; j++) {
				if ( a[j] > a[j+1] ) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		} 
	}
}
