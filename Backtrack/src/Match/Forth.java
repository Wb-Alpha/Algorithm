package Match;
import java.util.Scanner;
import java.util.ArrayList;
public class Forth {
	public static void main(String[] args) {
		boolean isVow = false;
		int temp = 0;
		
		Scanner reader = new Scanner(System.in);
		String in = reader.nextLine();
		String[] strin = in.split("");
		for (int i = 0; i < strin.length; i++) {
			if ( !isVow ) {
				if (judge(strin[i]) == true) {
					i--;
					temp++;
					isVow = true;
					continue;
				}
			}
			else {
				if ( judge(strin[i]) == false ) {
					i--;
					temp++;
					isVow = false;
					continue;
				}
			}
			
		}

		if (temp == 3) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}
	
	
	public static boolean judge(String a) {
		boolean judge = false;
		String[] vowel = {"a", "e", "i", "o", "u"};
		for (int i = 0; i<vowel.length; i++) {
			if (a.equals(vowel[i]) ) {
				judge = true;
			}
		}
		return judge;
	}
}
