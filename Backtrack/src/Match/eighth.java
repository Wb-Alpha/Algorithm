package Match;
import java.util.*;
public class eighth {
	static int[][] space;
	public static void main(String[] args) {
		int in = 0, count = 0;
		Scanner reader = new Scanner(System.in);
		in = reader.nextInt();
		space = new int [in+1][in+1];
		for (int i = 1; i<=in; i++) {
			space[i][i] = 1;
			space[i][0] = 1;
			space[0][i] = 1;
		}
		for (int i = 1; i <= in; i++) {
			count += solve(in, i);
			count %= 10000;
		}
		System.out.println(count);
	}
	
	public static int solve(int x, int y) {
		if(space[x][y] != 0)
			return space[x][y];
		for (int i = Math.abs(x-y) - 1; i >= 0; i--)
			space[x][y] += solve(y, i);
		space[x][y] %= 10000;
		space[y][x] = space[x][y];
		return space[x][y];
	}
}
