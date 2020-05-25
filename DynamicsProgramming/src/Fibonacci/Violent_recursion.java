package Fibonacci;

import java.util.Scanner;
import java.util.Vector;

public class Violent_recursion {

	//²âÊÔ
	public static void main(String[] args) {
		System.out.println("ÇëÊäÈëÊı×Ö");
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		System.out.println(fib(N));
	}
	
	
	//±©Á¦µİ¹é
	public static int fib(int N) {
		if(N==1 || N==2) return 1;
		return fib(N-1) + fib(N-2);
	}
}


