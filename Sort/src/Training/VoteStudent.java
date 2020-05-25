package Training;

import java.util.*;

public class VoteStudent {
	private static int[] aux;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] a = new int[n+1];
		
		for (int i = 1; i<=m; i++)
			a[in.nextInt()]++ ;
		
		for (int i=1; i<=n; i++) {
			for (int j=0; j<a[i]; j++) {				
				System.out.print(i+" ");
			}
		}

	}
}
