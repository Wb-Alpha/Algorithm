package Match;
import java.util.*;

public class Sixth {
	public static void main(String[] args) {
		boolean isSame = true;
		int m = 1;
		int n = 1;
		
		Scanner reader = new Scanner(System.in);
		int num = reader.nextInt();
		int index = num-2;
		int[] list = new int[num];
		for (int i = 0; i<num; i++) {
			list[i] = reader.nextInt();
		}
		
		Arrays.sort(list);
		
		while (isSame) {
			if ( list[0] != list[n] ) {
				isSame = false;
			}
			else {
				n++;
			}
		}
		
		isSame = true;
		
		while(isSame) {
			if ( list[num-1] != list[index] ) {
				isSame = false;
			}
			else {
				n++;
				index--;
			}
		}
		
		System.out.println(num-n-m);	
	}
}
