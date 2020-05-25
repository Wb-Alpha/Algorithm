package Match;

public class Third {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 0; i<=2019; i++) {
			if ( i % 10 == 9) {
				count++;
			}
		}
		System.out.println(count);
	}
}
