
import java.util.*;

public class LetterDraw {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		
		for (int i=0; i<n; i++) {
			int count = 0;
			for (int j=i; j>0; j--) {
				if (count < m) {
					System.out.print((char)(j+65));
					count++;
				}
			}
			
			for (int j=0; j<m-i; j++) {
				System.out.print((char)(j+65));
			}
			System.out.println();
		}
		
		in.close();
	}
}
