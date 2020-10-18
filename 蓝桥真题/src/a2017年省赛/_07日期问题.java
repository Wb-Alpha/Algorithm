package a2017年省赛;

import java.util.Scanner;

public class _07日期问题 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String data = in.nextLine();
		String[] strLst = data.split("/");
		int[] arr = new int[strLst.length];
		
		for (int i = 0; i < strLst.length; i++) {
			arr[i] = Integer.parseInt(strLst[i]);
		}
		
		for (int y = 0; y < 3; y++) {
			for(int d = 0; d < 3; d++) {
				if (arr[d] > 31 || d == y) {
					continue;
				}
				int m = trans(y, d);
				if ( m > 12 ) {
					continue;
				}
				if (check(arr[y], arr[m], arr[d])) {
					String year;
					String month;
					String day;
					if ( arr[y] < 60) {
						year = Integer.toString(arr[y]+2000);
					}
					else {
						year = Integer.toString(arr[y]+1900);
					}
					
					if ( arr[m] < 10) {
						month = "0"+Integer.toString(arr[m]);
					}
					else {
						month = Integer.toString(arr[m]);
					}
					
					if ( arr[d] < 10) {
						day = "0"+Integer.toString(arr[d]);
					}
					else {
						day = Integer.toString(arr[d]);
					}
					System.out.println(year+"-"+month+"-"+day);
				}
			}
		}
		in.close();
	}

	private static boolean check(int y, int m, int d) {
		// TODO Auto-generated method stub
		if ( y < 60) {
			y += 2000;
		}
		else {
			y += 1900;
		}
		
		if (m%2 == 1 && d < 32) {
			return true;
		}
		else if (m%2 == 0 && m/2 == 1) {
			if (y % 4 == 0 && d < 30) {
				return true;
			}
			else if (d < 29) {
				return true;
			}
		}
		else if (d < 31) {
			return true;
		}
		return false;
	}

	private static int trans(int y, int d) {
		// TODO Auto-generated method stub
		int[] a = {0,0,0};
		a[y] = 1;
		a[d] = 1;
		for (int i = 0; i < 3; i++) {
			if (a[i] == 0)
				return i;
		}
		return -1;
	}
}
