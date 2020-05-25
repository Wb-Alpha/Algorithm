package Training;
/*
 * 地球历公元 6036 年，全宇宙准备竞选一个最贤能的人当总统，
 * 共有 nn 个非凡拔尖的人竞选总统，现在票数已经统计完毕，请你算出谁能够当上总统。
 */

import java.util.*;

public class President {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String max = "0";
		String input;
		int id=0;
		int N = in.nextInt();
		
		for (int i=1; i<=N; i++) {
			input = in.next();
			int inSize = input.length();
			int maxSize = max.length();
			
			if (inSize > maxSize || (inSize >= maxSize && input.compareTo(max)>0)) {
				max = input;
				id = i;
			}
		}
		
		System.out.println(id);
		System.out.println(max);
	}
}
