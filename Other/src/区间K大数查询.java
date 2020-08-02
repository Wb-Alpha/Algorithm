
import java.util.*;

public class 区间K大数查询 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i=0; i<n; i++) {
			arr[i] = in.nextInt();
		}
		
		int m = in.nextInt();
		int[] result = new int[m];
		for (int i=0; i<m; i++) {
			int l = in.nextInt();
			int r = in.nextInt();
			int k = in.nextInt();
			l--;
			r--;
			int[] copy = arr;
			
			for (int a=l; a<r-1; a++) {
				for (int b=a; b<r; b++) {
					if ( copy[a] > copy[b] ) {
						int temp = copy[a];
						copy[a] = copy[b];
						copy[b] = temp;
					}
				}
			}
			result[i] = copy[r-k+1];
		}
		
		for (int i=0; i<m; i++)
			System.out.println(result[i]);
	}
}
