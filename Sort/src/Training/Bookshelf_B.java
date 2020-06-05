package Training;

import java.util.Scanner;

public class Bookshelf_B {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int B = in.nextInt();
		int[] H = new int[N];
		int sum = 0;
		
		for (int i=0; i<N; i++) {
			H[i] = in.nextInt();
		}
		Sort(H);
		
		for (int i=0; i<N; i++) {
			sum += H[i];
			if (sum >= B) {
				System.out.println(i);
				break;
			}
		}
	}
	
	public static void Sort(int[] a) {
		for(int i=0; i<a.length; i++) {
			for (int j=i; j>0; j--) {
				if (a[i] <a [j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
}
