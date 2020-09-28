package a2013年省赛B组;

import java.util.Calendar;

public class _01世纪末的星期 {
	public static void main(String[] args) {
		
	}
	
	private static void solution1() {
		Calendar cal = Calendar.getInstance();
		
		for (int year = 1999; year < 10000; year+=100) {
			cal.set(Calendar.YEAR, year);
			cal.set(Calendar.MONTH, 11);
			cal.set(Calendar.DAY_OF_MONTH, 31);
			
			if (cal.get(Calendar.DAY_OF_WEEK) == 1) {
				System.out.println(year);
				break;
			}
		}
	}
	
	private static void solution2() {
		for (int i = 1999; i < 10000; i+=100) {
			
		}
	}
}
