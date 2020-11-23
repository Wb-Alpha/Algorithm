package a2013决赛;


public class B01J猜灯谜_答案 {
 
	public static void main(String[] args) {
		// 从317开始，平方才能达到六位数
		for (int a = 3; a <= 9; a++) {
			for (int b = 0; b <= 9; b++) {
				if (a != b)
					for (int c = 0; c <= 9; c++) {
						int num = a * 100 + b * 10 + c;
						if (num > 316) {
							int num_num = num * num;
							int shiwan = num_num / 100000;
							int wan = num_num % 100000 / 10000;
							int shi = num_num % 100 / 10;
							int ge = num_num % 10;
							// 这里只需做几个标志性的判断，若结果出现多个（并不是很多就不用添加判断条件），再选择挑选符合要求的
							if (a == shiwan && b == ge && wan == shi) {
								System.out.println("" + a + b + c);
								System.exit(0);
							}
						}
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
