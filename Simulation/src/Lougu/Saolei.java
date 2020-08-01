package Lougu;

import java.util.Scanner;

public class Saolei {
	
	
	public static void main(String[] args) {
		int[] data = new int[2];
		Scanner in = new Scanner(System.in);
		for (int i=0; i<=1; i++) {
			data[i] = in.nextInt();
		}
		
		String[][] result = new String[data[0]][data[1]];
		for (int i=0; i<data[0]; i++) {
			for (int j=0; j<data[1]; j++) {
				result[i][j] = "0";
			}
		}
		
		for (int i=0; i<data[0]; i++) {
			String temp = in.next();
			String[] tempList = temp.split("");
			for (int j=0; j<tempList.length; j++) {
				if (tempList[j].equals("*"))
					result[i][j] = tempList[j];
			}
		}
		
		for (int i=0; i<data[0]; i++) {
			for (int j=0; j<data[1]; j++) {
				if (!result[i][j].equals("*")) {
					int count = 0;
					for(int n=-1; n<=1; n++) {
						for(int m=-1; m<=1; m++) {
							if(i+n>=0 && i+n<data[0] && j+m>=0 && j+m<data[1]) {
								if (result[i+n][j+m].equals("*")) {
									count++;
								}
							}
						}
					}
					result[i][j] = String.valueOf(count);
				}
			}
		}
		
		for (int i=0; i<data[0]; i++) {
			for (int j=0; j<data[1]; j++) {
				System.out.print(result[i][j]);
			}
			System.out.println();
		}
		
		in.close();
	}
	
}
