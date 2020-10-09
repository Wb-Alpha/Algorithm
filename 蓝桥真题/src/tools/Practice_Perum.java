package tools;

public class Practice_Perum {
	public static void main(String[] args) {
		int[] a = {1,2,3,4};
		arrange(a, 0, a.length);
	}
	
	//交换
	public static void swap(int a[],int i,int j){
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	// 全排列
	public static void arrange(int[] a, int index, int length) {
		if (index>=length-1) {
			output(a);
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

