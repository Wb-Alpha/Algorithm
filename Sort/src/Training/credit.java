package Training;

import java.util.*;

public class credit {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[][] data = new int[3][N];
		int count = 1;
		
		for (int j=0; j<N; j++) {
			data[0][j] = count;//Ñ§ºÅ
			data[1][j] = in.nextInt();//ÓïÎÄ³É¼¨
			
			for (int i=0; i<3; i++) {
				System.out.print(data[i][j]);
			}
			System.out.println();
		}

		in.close();
	}
	
	public static void sort(int[][] a) {
		
	}
}
