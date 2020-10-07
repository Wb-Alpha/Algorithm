package a2013年省赛B组;

import java.util.ArrayList;
import java.util.Scanner;

public class _08幸运数 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		ArrayList<Integer> lst = new ArrayList<Integer>();
		for (int i = m+1; i < n; i++) {
			
			lst.add(i);
		}
		f(lst);
		in.close();
	}
	
	private static void f(ArrayList<Integer> lst) {
		System.out.println("size="+lst.size()+"  Step="+lst.get(1));
		int step = lst.get(1);
		if (step >= lst.size()) {
			System.out.println(lst.size());
		}
		else {
			ArrayList<Integer> a = new ArrayList<Integer>();
			for (int i = 0; i < lst.size(); i = i+step) {
				System.out.println(lst.get(i));
				a.add(lst.get(i));
			}
			f(a);
		}
	}
}
