package a2015年省赛;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class _07牌型总数 {
	static Set<Set> setLst; 
	public static void main(String[] args) {
		setLst = new HashSet<Set>();
		int[] a = {1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,4,5,5,5,5,6,6,
				6,6,7,7,7,7,8,8,8,8,9,9,9,9,
				10,10,10,10,11,11,11,11,12,12,12,12,13,13,13,13};
		f(a, 0, 52);
		System.out.println(setLst.size());
	}
	
	public static void f(int[] a, int k, int length) {
		if (k >= length-1) {
			System.out.println("1");
			check(a);
		}
		else {
			for(int i = k; i < length; i++) {
				swap(a, i, k);
				f(a, k+1, length);
				swap(a, i, k);
			}
		}
	}
	
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void check(int[] a) {
		Set<Integer> temp = new HashSet<Integer>();
		for(int i = 0; i < 13; i++) {
			temp.add(a[i]);
		}
		setLst.add(temp);
	}
}
