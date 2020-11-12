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

