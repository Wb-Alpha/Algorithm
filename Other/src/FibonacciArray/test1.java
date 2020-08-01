package FibonacciArray;

import java.util.*;

public class test1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] array = new int[n+1];
		
		if (n>2) {
			array[1] = array[2] = 1;
			for (int i=3; i<=n; i++) {
				array[i] = array[i-1]+array[i-2];
				if (array[i] > 10007) 
					array[i] -= 10007;
			}
		}
		else{
			array[n]=1;
		}
		

		System.out.println(array[n]);
	}
}
