package a2014Ê¡Èü;

import java.util.ArrayList;

public class _03²Â×ÖÄ¸ {
	public static void main(String[] args) {
		String temp = "abcdefghijklmnopqrs";
		for (int i = 1; i < 106; i++) {
			temp = temp+ "abcdefghijklmnopqrs";
		}
		
		ArrayList<String> a = new ArrayList<String>();
		String[] lst = temp.split("");
		for (int i = 0; i < lst.length; i++) {
			a.add(lst[i]);
		}
		f(a);
	}
	
	public static void f(ArrayList<String> a) {
		if (a.size() == 1) 
			System.out.println(a.get(0));
		else {
			ArrayList<String> temp = new ArrayList<String>();
			for (int i = 1; i < a.size(); i=i+2) {
				temp.add(a.get(i));
			}
			f(temp);
		}
	}
}
