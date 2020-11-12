package a2013决赛;

public class B01J猜灯谜 {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == j)
					continue;
				for (int p = 0; p < 10; p++) {
					if (j == p || p == i)
						continue;
					//System.out.println(i+" "+j+" "+p);
					int sum = i*100+j*10+p;
					if (sum*sum%10 == j && sum*sum/100000 == i)
						System.out.println(sum);
				}
			}
		}
	}
}


//A 村的元宵节灯会上有一迷题：
//
//请猜谜 * 请猜谜 = 请边赏灯边猜
//
//小明想，一定是每个汉字代表一个数字，不同的汉字代表不同的数字。
//
//请你用计算机按小明的思路算一下，然后提交“请猜谜”三个字所代表的整数即可。
//
//请严格按照格式，通过浏览器提交答案。
//注意：只提交一个3位的整数，不要写其它附加内容，比如：说明性的文字。