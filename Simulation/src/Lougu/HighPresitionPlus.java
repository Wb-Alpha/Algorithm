package Lougu;

import java.util.*;

public class HighPresitionPlus {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String num1 = in.next();
		String num2 = in.next();
	}
	
	public static String plus(String str1, String str2) {
		String result;
		int length1 = str1.length();
		int length2 = str2.length();
		if (length1 < length2) {
			for (int i=1; i < length2-length1; i++)
				str1 = "0"+str1;
		}
		else {
			for (int i=1; i < length1-length2; i++)
				str2 = "0"+str2;
		}
		
		length1 = str1.length();
		int cf = 0;
		int temp = 0;
		
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		
		for (int i=length1-1; i>=0; i--) {
			temp = charArray1[i]-'0'+charArray2[i]-'0'+cf;
			cf = temp/10;
			temp %= 10;
			result = char(temp+'0')+result;
		}
		
		if (cf != 0)
			result = char(cf+'0')+result;
		return null;
	}
}
