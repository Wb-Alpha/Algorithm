package a2015年省赛;

public class _06加法变乘法 {
	public static void main(String[] args) {
		int a[] = new int[50];
		int sum;
		
		for (int i = 1; i < a.length; i++) {
			a[i] = i;
		}

		for (int i = 1; i <49; i++) {
			for (int j = 2; j < 49; j++) {
				if (i == j)
					continue;
				sum = f(a, i, j);
				if (sum == 2015)
					System.out.println(i+" "+j);
			}
		}
	}
	
	
	public static int f(int[] a,int p, int q) {
		int sum = 0;
		boolean isJump = false;
		for (int i = 1; i <= 49; i++) {
			if (isJump) {
				isJump = false;
				continue;
			}
			if(i == q-1 || i == p-1) {
				sum = sum+a[i]*a[i+1];
				isJump = true;
				continue;
			}
			else {
				sum = sum+a[i];
			}
		}
		return sum;
	}
}
