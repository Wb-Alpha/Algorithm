
import java.util.*;

public class ArrayIndex {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int index = -2;
		int[] arr = new int[n];
		boolean isFirst = true;
		for (int i=0; i<n; i++) {
			arr[i] = in.nextInt();
		}
		
		int target = in.nextInt();
		for (int i=0; i<n; i++) {
			if (target == arr[i] && isFirst) {
				index = i;
				isFirst = false;
			}
				
		}
		System.out.println(index+1);
		in.close();
	}
}
