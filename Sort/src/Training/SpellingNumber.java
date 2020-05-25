package Training;

/*
设有nn个正整数(n≤20)(n≤20)，将它们联接成一排，组成一个最大的多位整数。
例如：n=3n=3时，33个整数1313,312312,343343联接成的最大整数为：3433121334331213
又如：n=4n=4时，44个整数77,1313,44,246246联接成的最大整数为：74246137424613
 */

import java.util.*;

public class SpellingNumber {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String[] num = new String[N];
		for (int i=0; i<N; i++) {
			num[i] = in.next();
		}
		
		for (int i=1; i<N; i++) {
			for (int j=0; j<N-1; j++) {
				String temp1 = num[j]+num[j+1];
				String temp2 = num[j+1]+num[j];
				if (temp1.compareTo(temp2) < 0) {
					String temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		}
		
		for(int i=0; i<N; i++) {
			System.out.print(num[i]);
		}
	}
}
