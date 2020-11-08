package a2017年决赛;

public class _01平方十位数 {
	static long max = 0;
	
	public static void main(String[] args) {
		char[] a = {'0','1','2','3','4','5','6','7','8','9'};
		arrange(a,0,a.length);
		System.out.println(max);
	}
	

	//交换
	public static void swap(char a[],int i,int j){
		char temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	// 全排列
	public static void arrange(char[] a, int index, int length) {
		if (index>=length-1) {
			long temp = Long.parseLong(String.valueOf(a));
			if (temp > max) {
				if (Math.sqrt((double)temp)%1 == 0)
					max = temp;
			}
//			long temp =  Long.parseLong(a.toString());
//			System.out.println(temp);

				
		}
		else {
			for (int i = index; i < length; i++) {
				swap(a,index,i);
				arrange(a, index+1, length);
				swap(a,index,i);
			}
		}
	}
	
	// 输出数组
	public static void output(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
}


/*
 * 标题：平方十位数
 * 
 * 由0~9这10个数字不重复、不遗漏，可以组成很多10位数字。 这其中也有很多恰好是平方数（是某个数的平方）。
 * 
 * 比如：1026753849，就是其中最小的一个平方数。
 * 
 * 请你找出其中最大的一个平方数是多少？
 * 
 * 注意：你需要提交的是一个10位数字，不要填写任何多余内容。
 */