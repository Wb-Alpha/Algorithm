package Match;
import java.util.*;
public class tenth {
	static int n = 0;
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		n = reader.nextInt();
		int m = reader.nextInt();
		int[] value = new int[n];
		int[] index = new int[m];
		int[][] sort = new int[n][2];
		for (int i = 0; i < n; i++) {
			value[i] = reader.nextInt();
			sort[i][0] = value[i];
			sort[i][1] = i;
		}
		sort(sort);
		int count = m;
		for (int i = n-1; count > 0; count--) {
			index[count-1] = sort[i][1];
			i--;
			System.out.println(index[count-1]);
		}
		sort1(index);
		for (int i = 0; i<index.length; i++) {
			System.out.println();
		}
		
	}
	public static void sort(int[][] a) {
		for (int i = 0; i < n; i++) {
			int min = i;
			for (int j = i+1; j<n; j++) {
				if ( a[j][0] < a[min][0] )
					min = j;
			}
			int t = a[i][0];
			a[i][0] = a[min][0];
			a[min][0] = t;
			t = a[i][1];
			a[i][1] = a[min][1];
			a[min][1] = t;
		}
	}

	public static void sort1(int[] index) {
		int N = index.length;
		for (int i = 0; i < N; i++) {
			//将a[i]和a[i+1]到a[N]中的最小元素作交换
			int min = i;
			for (int j = i+1; j<N; j++) {
				if ( index[j]<index[min])//如果a[j]<a[min]
					min = j;
			}
			//将a[i]和a[min]调换位置
			int t = index[i];
			index[i] = index[min];
			index[min] = t;
		}
	}

}
