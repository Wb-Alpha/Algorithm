package ��ϰϵͳ;

import java.util.*;

public class ���� {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Integer> lst = new ArrayList<Integer>();
		for (int i = 0; i < 3; i++) {
			lst.add(in.nextInt());
		}
		lst.sort(null);
		Collections.reverse(lst);
		for(int i : lst){
			System.out.print(i+" ");
		}
	}
}