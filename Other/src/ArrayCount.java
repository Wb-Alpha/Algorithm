
import java.util.*;

public class ArrayCount {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		int sum = 0;
		for (int i=0; i<n; i++) {
			arr[i] = in.nextInt();
			sum += arr[i];
		}
		
		for (int i=0; i<n; i++) {
			for (int j=i; j<n;j++) {
				if (arr[i]>arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		
		System.out.println(arr[n-1]);
		System.out.println(arr[0]);
		System.out.println(sum);
		
		in.close();
	}
}
