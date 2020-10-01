package ¡∑œ∞œµÕ≥;

import java.util.*;

public class æ∞µ„‰Ø¿¿ {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<Integer> lst = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			lst.add(in.nextInt());
		}
		lst.sort(null);
		Collections.reverse(lst);
		for (int i : lst) {
			System.out.print(i+" ");
		}
		
		in.close();
	}
}
