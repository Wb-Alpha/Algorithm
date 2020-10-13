package a2016年省赛;

public class _03凑算式 {
	static int ans;
	public static void main(String[] args) {
		double[] a = {1,2,3,4,5,6,7,8,9};
		ans = 0;
		f(a, 0, a.length);
		System.out.println(ans);
	}
	
	public static void f(double[] a, int index, int length) {
		double sum = 0;
		if (index >= length-1) {
			sum = a[0]+a[1]/a[2]+(a[3]*100+a[4]*10+a[5])/(a[6]*100+a[7]*10+a[8]);
			if (sum == 10.0) {
				System.out.println(a[0]+" "+a[1]+" "+a[2]+" "+a[3]+" "+a[4]+" "+a[5]+" "+a[6]+" "+a[7]+" "+a[8]);
				ans++;
			}
			return;
		}
		
		for (int i = index; i < length; i++) {
			swap(a, index, i);
			
			f(a, index+1, length);
			
			swap(a, index, i);
		}
	}
	
	public static void swap(double[] a, int i, int j) {
		double temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
