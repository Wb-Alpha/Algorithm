package Training;

/*
 cjf君想调查学校OI组每个同学的生日，并按照从大到小的顺序排序。但cjf君最近作业很多，没有时间，所以请你帮她排序。
输入格式
有22行，

第11行为OI组总人数nn；

第22行至第n+1n+1行分别是每人的姓名ss、出生年yy、月mm、日dd。

输出格式
有nn行，

即nn个生日从大到小同学的姓名。(如果有两个同学生日相同,输入靠后的同学先输出)
 */

import java.util.*;

public class Birthday {
	public static void main(String[] args) {
		String y,m,d;
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		Map<String,String>[] maps = new HashMap[N];
		for (int i=0; i<N; i++) {
			String info = in.nextLine();
			System.out.println(info);
			String[] num = info.split(" ");
			for (int j=1; j<4; j++) {
				if ( Integer.parseInt(num[j]) < 10)
					num[j] = "0"+num[j];
			}
			
			String bir = num[1]+num[2]+num[3];

		}
		
		
		in.close();
	}
}
