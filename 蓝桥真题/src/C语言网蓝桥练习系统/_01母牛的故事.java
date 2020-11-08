package CÓïÑÔÍøÀ¶ÇÅÁ·Ï°ÏµÍ³;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _01Ä¸Å£µÄ¹ÊÊÂ {
	public static void main(String[] args) {
		int[] year = new int[55];
		List<Integer> cows = new ArrayList<Integer>();
		cows.add(5);
		
		for (int i = 0; i < year.length; i++) {
			for (int j = 0; j < cows.size(); j++) {
				cows.set(j, cows.get(j)+1);
				//System.out.println(cows.get(j));
				if (cows.get(j) >= 4) {
					cows.add(1);
				}
			}
			System.out.println(cows.size());
			year[i] = cows.size();
		}
		
//		Scanner in = new Scanner(System.in);
//		while(true) {
//			int input = in.nextInt();
//			if (input == 0)
//				break;
//			System.out.println(year[input]);
//		}
//		in.close();
	}
}
